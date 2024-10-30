package keyin.http.cli;

import domain.*;
import keyin.http.client.RestClient;

import java.util.List;

public class HTTPRestCLIApplication {

    private RestClient restClient;

    public String generateCityReport() {
        CityReport city = getRestClient().getCity();

        StringBuffer report = new StringBuffer();


            report.append(city.getCity().getName());
            report.append(" - ");
            report.append(city.getCity().getState());
            report.append(" - ");
            report.append("Airports:\n");
            for(AirPort airport: city.getAirports() ){
                report.append(airport.getId());
                report.append(" - ");
                report.append(airport.getName());
                if (city.getAirports().indexOf(airport) != (city.getAirports().size() - 1)) {
                    report.append(", ");
                }
            }






        System.out.println(report.toString());

        return report.toString();
    }

    public String generateAllCityReport() {
        List<CityReport> cities = getRestClient().getAllCities();

        StringBuffer report = new StringBuffer();


        for(CityReport city: cities) {
            report.append(city.getCity().getName());
            report.append(" - ");
            report.append(city.getCity().getState());
            report.append(" - ");
            report.append("Airports:\n");
            for (AirPort airport : city.getAirports()) {
                report.append(airport.getId());
                report.append(" - ");
                report.append(airport.getName());
                if (city.getAirports().indexOf(airport) != (city.getAirports().size() - 1)) {
                    report.append(", ");
                }
            }
            report.append("\n");
        }




        System.out.println(report.toString());

        return report.toString();
    }


    public String generateAirCraftReport() {
        AirCraftReport aircraft = getRestClient().getAirCraft();

        StringBuffer report = new StringBuffer();


        report.append(aircraft.getAirCraft().getAirCraft_id());
        report.append(" - ");
        report.append(aircraft.getAirCraft().getType());
        report.append(" - ");
        report.append(aircraft.getAirCraft().getAirlineName());
        report.append(" - ");
        report.append("Airports:\n");
        for(AirPort airport: aircraft.getAirports() ){
            report.append(airport.getId());
            report.append(" - ");
            report.append(airport.getName());
            if (aircraft.getAirports().indexOf(airport) != (aircraft.getAirports().size() - 1)) {
                report.append(", ");
            }
        }




        System.out.println(report.toString());

        return report.toString();
    }

    public String generateAllAirCraftReport() {
        List<AirCraftReport> airCrafts = getRestClient().getAllAirCrafts();

        StringBuffer report = new StringBuffer();


        for(AirCraftReport airCraft: airCrafts) {
            report.append(airCraft.getAirCraft().getAirCraft_id());
            report.append(" - ");
            report.append(airCraft.getAirCraft().getType());
            report.append(" - ");
            report.append(airCraft.getAirCraft().getAirlineName());
            report.append(" - ");
            report.append("Airports:\n");
            for (AirPort airport : airCraft.getAirports()) {
                report.append(airport.getId());
                report.append(" - ");
                report.append(airport.getName());
                if (airCraft.getAirports().indexOf(airport) != (airCraft.getAirports().size() - 1)) {
                    report.append(", ");
                }
            }
        }




        System.out.println(report.toString());

        return report.toString();
    }

    public String generatePassengerAirportReport() {
       PassengerAirPortReport passengerAirPortReport = getRestClient().getPassenger();

        StringBuffer report = new StringBuffer();


        report.append(passengerAirPortReport.getPassenger().getFirstName());
        report.append(" - ");
        report.append(passengerAirPortReport.getPassenger().getLastName());
        report.append(" - ");
        report.append(passengerAirPortReport.getPassenger().getPhoneNumber());
        report.append(" - ");
        report.append("Airports:\n");
        for(AirPort airport: passengerAirPortReport.getAirports() ){
            report.append(airport.getId());
            report.append(" - ");
            report.append(airport.getName());
            if (passengerAirPortReport.getAirports().indexOf(airport) != (passengerAirPortReport.getAirports().size() - 1)) {
                report.append(", ");
            }
        }




        System.out.println(report.toString());

        return report.toString();
    }


    private void listGreetings() {
        System.out.println(getRestClient().getResponseFromHTTPRequest());
    }

    public RestClient getRestClient() {
        if (restClient == null) {
            restClient = new RestClient();
        }

        return restClient;
    }

    public void setRestClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }

        HTTPRestCLIApplication cliApp = new HTTPRestCLIApplication();

        String serverURL = args[0];

        if (serverURL != null && !serverURL.isEmpty()) {

            RestClient restClient = new RestClient();
            restClient.setServerURL(serverURL);

            cliApp.setRestClient(restClient);

            if (serverURL.contains("greeting")) {
                cliApp.listGreetings();
            } else {
                cliApp.generatePassengerAirportReport();
            }
        }

    }
}
