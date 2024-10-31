import domain.AirPort;
import domain.City;
import domain.CityReport;
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
}
