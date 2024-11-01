import domain.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import keyin.http.client.RestClient;

import java.util.List;

public class RESTClientTest {
    @Test
    public void buildAirCraftFromResponse() throws Exception {
        String jsonResponse = "{\"aircraft\":{\"airCraft_id\":1,\"type\":\"Airbus 320\",\"airlineName\":\"pal\",\"numberOfPass\":100},\"airports\":[{\"id\":2,\"name\":\"Victoria Airport\",\"code\":\"A2K3S45\",\"city_id\":{\"city_id\":2,\"name\":\"Victoria\",\"state\":\"British Columbia\",\"population\":25000}},{\"id\":1,\"name\":\"Miami Airport\",\"code\":\"A2K3S35\",\"city_id\":{\"city_id\":1,\"name\":\"Miami\",\"state\":\"Florida\",\"population\":3000}}]}";

        RestClient restClient = new RestClient();

        AircraftReport aircraft = restClient.buildAirCraftFromResponse(jsonResponse);

        Assertions.assertTrue(aircraft.getAircraft().getType().equals("Airbus 320"));
    }


    @Test
    public void buildPassengerAirCraftFromResponse() throws Exception {
            String jsonResponse = "{\"passenger\":{\"passenger_id\":1,\"firstName\":\"Greg\",\"lastName\":\"Thomas\",\"phoneNumber\":\"1542348456\",\"city_id\":{\"city_id\":1,\"name\":\"Miami\",\"state\":\"Florida\",\"population\":3000}},\"airCrafts\":[{\"airCraft_id\":1,\"type\":\"Airbus A320\",\"airlineName\":\"pal\",\"numberOfPass\":100}]}";

            RestClient restClient = new RestClient();

            PassengerAirCraftReport passenger = restClient.buildPassengerAirCraftFromResponse(jsonResponse);

            Assertions.assertTrue(passenger.getPassenger().getFirstName().equals("Greg"));
        }

    @Test
    public void buildCityFromResponse() throws Exception {
        String jsonResponse = "{\"city\":{\"city_id\":1,\"name\":\"Miami\",\"state\":\"Florida\",\"population\":3000},\"airports\":[{\"id\":1,\"name\":\"Miami Airport\",\"code\":\"A2K3S35\",\"city_id\":{\"city_id\":1,\"name\":\"Miami\",\"state\":\"Florida\",\"population\":3000}}],\"passangers\":null}";

        RestClient restClient = new RestClient();

        CityReport city = restClient.buildCityFromResponse(jsonResponse);

        Assertions.assertTrue(city.getCity().getName().equals("Miami"));
    }

    @Test
    public void buildPassengerFromResponse() throws Exception {
        String jsonResponse = "{\"passenger\":{\"passenger_id\":1,\"firstName\":\"Greg\",\"lastName\":\"Thomas\",\"phoneNumber\":\"1542348456\",\"city_id\":{\"city_id\":1,\"name\":\"Miami\",\"state\":\"Florida\",\"population\":3000}},\"airports\":[{\"id\":2,\"name\":\"Victoria Airport\",\"code\":\"A2K3S45\",\"city_id\":{\"city_id\":2,\"name\":\"Victoria\",\"state\":\"British Columbia\",\"population\":25000}},{\"id\":1,\"name\":\"Miami Airport\",\"code\":\"A2K3S35\",\"city_id\":{\"city_id\":1,\"name\":\"Miami\",\"state\":\"Florida\",\"population\":3000}}]}";

        RestClient restClient = new RestClient();

        PassengerAirPortReport passenger = restClient.buildPassengerFromResponse(jsonResponse);

        Assertions.assertTrue(passenger.getPassenger().getFirstName().equals("Greg"));
    }
}
