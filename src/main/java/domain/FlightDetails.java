package domain;

import domain.AirCraft;
import domain.Passenger;
import domain.FlightDetails;
import domain.Landing;
import domain.Landing;


import java.util.List;


public class FlightDetails {

    long flight_id;


    AirCraft airCraft;


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

    public AirCraft getAirCraft() {
        return airCraft;
    }

    public void setAirCraft(AirCraft airCraft) {
        this.airCraft = airCraft;
    }

    public long getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(long flight_id) {
        this.flight_id = flight_id;
    }




}
