package domain;

import java.util.List;

public class PassengerAirCraftReport {

    private Passenger passenger;
    private List <Aircraft> aircrafts;

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public List<Aircraft> getAirCrafts() {
        return aircrafts;
    }

    public void setAircrafts(List<Aircraft> airCrafts) {
        this.aircrafts = airCrafts;
    }
}

