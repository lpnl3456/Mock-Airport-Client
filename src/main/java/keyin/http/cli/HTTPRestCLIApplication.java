package keyin.http.cli;

import domain.AirPort;
import domain.City;
import domain.CityReport;
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
                cliApp.generateAllCityReport();
            }
        }

    }
}
