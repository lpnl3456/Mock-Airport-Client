package domain;


import java.util.List;
import java.util.Objects;

public class City {

    private long city_id;
    private String name;
    private String state;
    private int population;

    private List<AirPort> airports;
    private List<Passenger> passengers;

    public City(){
    }

    public City(long city_id) {
        this.city_id = city_id;
    }

    public City(long city_id, String name, String state, int population, List<AirPort> airports, List<Passenger> passengers) {
        this.city_id = city_id;
        this.name = name;
        this.state = state;
        this.population = population;
        this.airports = airports;
        this.passengers = passengers;
    }

    public City(long city_id, String name, String state, int population) {
        this.city_id = city_id;
        this.name = name;
        this.state = state;
        this.population = population;
    }

    public City( String name, String state, int population) {
        this.name = name;
        this.state = state;
        this.population = population;
    }

    public long getCity_id() {
        return city_id;
    }

    public void setCity_id(long city_id) {
        this.city_id = city_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<AirPort> getAirports() {
        return airports;
    }

    public void setAirports(List<AirPort> airports) {
        this.airports = airports;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passenger) {
        this.passengers = passenger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
