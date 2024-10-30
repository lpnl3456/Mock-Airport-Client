package keyin.http.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import domain.*;

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

    public CityReport getCity() {
        CityReport city = new CityReport();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(serverURL)).build();

        try {
            HttpResponse<String> response = getClient().send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()==200) {
                System.out.println("***** " + response.body());
            } else {
                System.out.println("Error Status Code: " + response.statusCode());
            }

            city = buildCityFromResponse(response.body());


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


        return city;
    }

    public List<CityReport> getAllCities() {
        List<CityReport> cities = new ArrayList<CityReport>();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(serverURL)).build();

        try {
            HttpResponse<String> response = getClient().send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()==200) {
                System.out.println("***** " + response.body());
            } else {
                System.out.println("Error Status Code: " + response.statusCode());
            }

            cities = buildAllCityFromResponse(response.body());


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


        return cities;
    }

    public CityReport buildCityFromResponse(String response) throws JsonProcessingException {
         CityReport cities;

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        cities = mapper.readValue(response, new TypeReference<CityReport>(){});

        return cities;
    }

    public List<CityReport> buildAllCityFromResponse(String response) throws JsonProcessingException {
        List<CityReport> cities;

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        cities = mapper.readValue(response, new TypeReference<List<CityReport>>(){});

        return cities;
    }






    public AirCraftReport getAirCraft() {
       AirCraftReport airCraft = new AirCraftReport();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(serverURL)).build();

        try {
            HttpResponse<String> response = getClient().send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()==200) {
                System.out.println("***** " + response.body());
            } else {
                System.out.println("Error Status Code: " + response.statusCode());
            }

            airCraft = buildAirCraftFromResponse(response.body());


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


        return airCraft;
    }

    public List<AirCraftReport> getAllAirCrafts() {
        List<AirCraftReport> airCrafts = new ArrayList<AirCraftReport>();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(serverURL)).build();

        try {
            HttpResponse<String> response = getClient().send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()==200) {
                System.out.println("***** " + response.body());
            } else {
                System.out.println("Error Status Code: " + response.statusCode());
            }

            airCrafts = buildAllAircraftFromResponse(response.body());


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


        return airCrafts;
    }

    public AirCraftReport buildAirCraftFromResponse(String response) throws JsonProcessingException {
        AirCraftReport aircrafts;

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        aircrafts = mapper.readValue(response, new TypeReference<AirCraftReport>(){});

        return aircrafts;
    }

    public List<AirCraftReport> buildAllAircraftFromResponse(String response) throws JsonProcessingException {
        List<AirCraftReport> aircrafts;

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        aircrafts = mapper.readValue(response, new TypeReference<List<AirCraftReport>>(){});

        return aircrafts;
    }



    public PassengerAirPortReport getPassenger() {
        PassengerAirPortReport passenger = new PassengerAirPortReport();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(serverURL)).build();

        try {
            HttpResponse<String> response = getClient().send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()==200) {
                System.out.println("***** " + response.body());
            } else {
                System.out.println("Error Status Code: " + response.statusCode());
            }

            passenger = buildPassengerFromResponse(response.body());


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


        return passenger;
    }

    public List<PassengerAirPortReport> getAllPassengers() {
        List<PassengerAirPortReport> passengers = new ArrayList<PassengerAirPortReport>();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(serverURL)).build();

        try {
            HttpResponse<String> response = getClient().send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()==200) {
                System.out.println("***** " + response.body());
            } else {
                System.out.println("Error Status Code: " + response.statusCode());
            }

            passengers = buildAllPassengerFromResponse(response.body());


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


        return passengers;
    }

    public PassengerAirPortReport buildPassengerFromResponse(String response) throws JsonProcessingException {
        PassengerAirPortReport passenger;

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        passenger = mapper.readValue(response, new TypeReference<PassengerAirPortReport>(){});

        return passenger;
    }

    public List<PassengerAirPortReport> buildAllPassengerFromResponse(String response) throws JsonProcessingException {
        List<PassengerAirPortReport> passengers;

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        passengers = mapper.readValue(response, new TypeReference<List<PassengerAirPortReport>>(){});

        return passengers;
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
