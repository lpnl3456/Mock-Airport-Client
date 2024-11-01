
import domain.*;
import keyin.http.cli.HTTPRestCLIApplication;
import keyin.http.client.RestClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class HTTPRestCLIApplicationTest {
    @Mock
    private RestClient mockRESTClient;

    @Test
    public void testGenerateCityReport(){
        HTTPRestCLIApplication httpRestCLIApplicationUnderTest = new HTTPRestCLIApplication();

        CityReport cityReport = new CityReport();
        City stJohnsCity =  new City(1,"St John's","States", 2000);

        List<AirPort> airports = new ArrayList<AirPort>();

        AirPort airport = new AirPort(1,"St John's", "YYH",stJohnsCity);
        airports.add(airport);
        cityReport.setCity(stJohnsCity);
        cityReport.setAirports(airports);

        Mockito.when(mockRESTClient.getCity()).thenReturn(cityReport);
        httpRestCLIApplicationUnderTest.setRestClient(mockRESTClient);

        Assertions.assertTrue(httpRestCLIApplicationUnderTest.generateCityReport().contains("St John's"));

    }

    @Test
    public void testGenerateAircraftReport(){
        HTTPRestCLIApplication httpRestCLIApplicationUnderTest = new HTTPRestCLIApplication();

        AircraftReport aircraftReport = new AircraftReport();
        Aircraft boeing = new Aircraft(1, "Boeing 757", "Pal", 130);
        City stJohnsCity =  new City(1,"St John's","States", 2000);
        City deerLakeCity= new City(2,"Deer Lake","States", 2500);

        List<AirPort> airports = new ArrayList<AirPort>();

        AirPort airport1 = new AirPort(1,"St John's", "YYH",stJohnsCity);
        AirPort airport2 = new AirPort(2,"Deer LAke", "YYZ",deerLakeCity);
        airports.add(airport1);
        airports.add(airport2);
        aircraftReport.setAircraft(boeing);
        aircraftReport.setAirports(airports);

        Mockito.when(mockRESTClient.getAirCraft()).thenReturn(aircraftReport);
        httpRestCLIApplicationUnderTest.setRestClient(mockRESTClient);

        Assertions.assertTrue(httpRestCLIApplicationUnderTest.generateAirCraftReport().contains("Boeing 757"));

    }


        @Test
        public void testGeneratePassengerAircraftReport(){
            HTTPRestCLIApplication httpRestCLIApplicationUnderTest = new HTTPRestCLIApplication();

            PassengerAirCraftReport passengerAircraftReport = new PassengerAirCraftReport();
            Passenger passenger = new Passenger(1, "John", "Doe", "15678901234");
            Aircraft boeing = new Aircraft(1, "Boeing 757", "Pal", 130);
            Aircraft airbus = new Aircraft(2,"AirBus 380", "Spirit", 120);


            List<Aircraft> aircrafts = new ArrayList<Aircraft>();

            aircrafts.add(boeing);
            aircrafts.add(airbus);
            passengerAircraftReport.setPassenger(passenger);
            passengerAircraftReport.setAircrafts(aircrafts);

            Mockito.when(mockRESTClient.getAirCraftPassenger()).thenReturn(passengerAircraftReport);
            httpRestCLIApplicationUnderTest.setRestClient(mockRESTClient);

            Assertions.assertTrue(httpRestCLIApplicationUnderTest.generatePassengerAirCraftReport().contains("Boeing 757"));

        }
    @Test
    public void testGeneratePassengerAirPortReport(){
        HTTPRestCLIApplication httpRestCLIApplicationUnderTest = new HTTPRestCLIApplication();

        PassengerAirPortReport passengerAirPortReport = new PassengerAirPortReport();
        Passenger passenger = new Passenger(1, "John", "Doe", "15678901234");
        City stJohnsCity =  new City(1,"St John's","Newfoundland", 2000);
        City toronto =  new City(2,"Toronto","Ontario", 200000);


        AirPort a1 = new AirPort();
        a1.setName("StJohn's Airport");
        a1.setCode("AHZ");
        a1.setCity_id(stJohnsCity);

        AirPort a2 = new AirPort();
        a2.setName("Toronto Airport");
        a1.setCode("AVH");
        a1.setCity_id(toronto);

        List<AirPort> airports = new ArrayList<AirPort>();

       airports.add(a1);
       airports.add(a2);

       passengerAirPortReport.setPassenger(passenger);
       passengerAirPortReport.setAirports(airports);
        Mockito.when(mockRESTClient.getPassenger()).thenReturn(passengerAirPortReport);
        httpRestCLIApplicationUnderTest.setRestClient(mockRESTClient);

        Assertions.assertTrue(httpRestCLIApplicationUnderTest.generatePassengerAirportReport().contains("Toronto"));

    }
    }


