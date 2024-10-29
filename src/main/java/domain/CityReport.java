package domain;



import java.util.List;

public class CityReport {

    private City city;
    private List<AirPort> airports;
    private List<Passenger> passangers;

    public List<AirPort> getAirports() {
        return airports;
    }

    public void setAirports(List<AirPort> airports) {
        this.airports = airports;
    }

    public List<Passenger> getPassangers() {
        return passangers;
    }

    public void setPassangers(List<Passenger> passangers) {
        this.passangers = passangers;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }



}
