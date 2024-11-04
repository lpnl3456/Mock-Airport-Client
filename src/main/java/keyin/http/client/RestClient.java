package keyin.http.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import domain.AircraftReport;
import domain.CityReport;
import domain.PassengerAirPortReport;
import domain.PassengerAirCraftReport;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class RestClient {

    private String serverURL;
    private HttpClient client;

    public String getResponseFromHTTPRequest() {
        String responseBody = "";
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(serverURL)).build();

        try {
            HttpResponse<String> response = getClient().send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()!=200) {
                System.out.println("Status Code: " + response.statusCode());
            }

            responseBody = response.body();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return responseBody;
    }

    public CityReport getCityReport() {
        CityReport cityReport = new CityReport();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(serverURL)).build();

        try {
            HttpResponse<String> response = getClient().send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()==200) {
                System.out.println("***** " + response.body());
            } else {
                System.out.println("Error Status Code: " + response.statusCode());
            }

            cityReport = buildCityReportFromResponse(response.body());


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


        return cityReport;
    }

    public List<CityReport> getAllCityReports() {
        List<CityReport> cityReports = new ArrayList<CityReport>();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(serverURL)).build();

        try {
            HttpResponse<String> response = getClient().send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()==200) {
                System.out.println("***** " + response.body());
            } else {
                System.out.println("Error Status Code: " + response.statusCode());
            }

            cityReports = buildAllCityReportsFromResponse(response.body());


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


        return cityReports;
    }

    public CityReport buildCityReportFromResponse(String response) throws JsonProcessingException {
         CityReport cityReport;

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        cityReport = mapper.readValue(response, new TypeReference<CityReport>(){});

        return cityReport;
    }

    public List<CityReport> buildAllCityReportsFromResponse(String response) throws JsonProcessingException {
        List<CityReport> cityReports;

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        cityReports = mapper.readValue(response, new TypeReference<List<CityReport>>(){});

        return cityReports;
    }






    public AircraftReport getAirCraftReport() {
       AircraftReport aircraftReport = new AircraftReport();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(serverURL)).build();

        try {
            HttpResponse<String> response = getClient().send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()==200) {
                System.out.println("***** " + response.body());
            } else {
                System.out.println("Error Status Code: " + response.statusCode());
            }

            aircraftReport = buildAirCraftReportFromResponse(response.body());


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


        return aircraftReport;
    }

    public List<AircraftReport> getAllAirCraftReports() {
        List<AircraftReport> aircraftReports = new ArrayList<AircraftReport>();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(serverURL)).build();

        try {
            HttpResponse<String> response = getClient().send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()==200) {
                System.out.println("***** " + response.body());
            } else {
                System.out.println("Error Status Code: " + response.statusCode());
            }

            aircraftReports = buildAllAircraftReportsFromResponse(response.body());


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


        return aircraftReports;
    }

    public AircraftReport buildAirCraftReportFromResponse(String response) throws JsonProcessingException {
        AircraftReport aircraftReport;

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        aircraftReport = mapper.readValue(response, new TypeReference<AircraftReport>(){});

        return aircraftReport;
    }

    public List<AircraftReport> buildAllAircraftReportsFromResponse(String response) throws JsonProcessingException {
        List<AircraftReport> aircraftReports;

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        aircraftReports = mapper.readValue(response, new TypeReference<List<AircraftReport>>(){});

        return aircraftReports;
    }



    public PassengerAirPortReport getPassengerAirportReport() {
        PassengerAirPortReport passengerAirPortReport = new PassengerAirPortReport();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(serverURL)).build();

        try {
            HttpResponse<String> response = getClient().send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()==200) {
                System.out.println("***** " + response.body());
            } else {
                System.out.println("Error Status Code: " + response.statusCode());
            }

            passengerAirPortReport = buildPassengerAirportReportFromResponse(response.body());


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


        return passengerAirPortReport;
    }

    public List<PassengerAirPortReport> getAllPassengerAirportReports() {
        List<PassengerAirPortReport> passengerAirPortReports = new ArrayList<PassengerAirPortReport>();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(serverURL)).build();

        try {
            HttpResponse<String> response = getClient().send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()==200) {
                System.out.println("***** " + response.body());
            } else {
                System.out.println("Error Status Code: " + response.statusCode());
            }

            passengerAirPortReports = buildAllPassengerAirportReportsFromResponse(response.body());


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


        return passengerAirPortReports;
    }




    public PassengerAirCraftReport getAirCraftPassengerReport() {
        PassengerAirCraftReport passengerAirCraftReport = new PassengerAirCraftReport();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(serverURL)).build();

        try {
            HttpResponse<String> response = getClient().send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()==200) {
                System.out.println("***** " + response.body());
            } else {
                System.out.println("Error Status Code: " + response.statusCode());
            }

            passengerAirCraftReport = buildPassengerAirCraftReportFromResponse(response.body());


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


        return passengerAirCraftReport;
    }

    public List<PassengerAirCraftReport> getAllAirCraftPassengerReports() {
        List<PassengerAirCraftReport> passengerAirCraftReports = new ArrayList<PassengerAirCraftReport>();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(serverURL)).build();

        try {
            HttpResponse<String> response = getClient().send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()==200) {
                System.out.println("***** " + response.body());
            } else {
                System.out.println("Error Status Code: " + response.statusCode());
            }

            passengerAirCraftReports = buildAllAirCraftPassengerReportsFromResponse(response.body());


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


        return passengerAirCraftReports;
    }

    public PassengerAirPortReport buildPassengerAirportReportFromResponse(String response) throws JsonProcessingException {
        PassengerAirPortReport passengerAirPortReport;

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        passengerAirPortReport = mapper.readValue(response, new TypeReference<PassengerAirPortReport>(){});

        return passengerAirPortReport;
    }

    public List<PassengerAirPortReport> buildAllPassengerAirportReportsFromResponse(String response) throws JsonProcessingException {
        List<PassengerAirPortReport> passengerAirPortReports;

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        passengerAirPortReports = mapper.readValue(response, new TypeReference<List<PassengerAirPortReport>>(){});

        return passengerAirPortReports;
    }

    public List<PassengerAirCraftReport> buildAllAirCraftPassengerReportsFromResponse(String response) throws JsonProcessingException {
        List<PassengerAirCraftReport> passengerAirCraftReports;

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        passengerAirCraftReports = mapper.readValue(response, new TypeReference<List<PassengerAirCraftReport>>(){});

        return passengerAirCraftReports;
    }

    public PassengerAirCraftReport buildPassengerAirCraftReportFromResponse(String response) throws JsonProcessingException {
        PassengerAirCraftReport passengerAirCraftReport;

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        passengerAirCraftReport = mapper.readValue(response, new TypeReference<PassengerAirCraftReport>() {
        });

        return passengerAirCraftReport;
    }




    public String getServerURL() {
        return serverURL;
    }

    public void setServerURL(String serverURL) {
        this.serverURL = serverURL;
    }

    public HttpClient getClient() {
        if (client == null) {
            client  = HttpClient.newHttpClient();
        }

        return client;
    }
}
