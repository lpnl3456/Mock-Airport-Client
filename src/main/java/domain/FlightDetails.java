package domain;


import java.util.List;


public class FlightDetails {

    long flight_id;


    Aircraft airCraft;


    List<Passenger> passengers;


    TakeOff takeOff;

    Landing landing;

    public Landing getLanding() {
        return landing;
    }

    public void setLanding(Landing landing) {
        this.landing = landing;
    }

    public TakeOff getTakeOff() {
        return takeOff;
    }

    public void setTakeOff(TakeOff takeOff) {
        this.takeOff = takeOff;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Aircraft getAirCraft() {
        return airCraft;
    }

    public void setAirCraft(Aircraft airCraft) {
        this.airCraft = airCraft;
    }

    public long getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(long flight_id) {
        this.flight_id = flight_id;
    }




}
