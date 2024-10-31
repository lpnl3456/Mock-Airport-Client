package domain;

import java.util.List;

public class PassengerAirCraftReport {

    private Passenger passenger;
    private List <Aircraft> airCrafts;

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public List<Aircraft> getAirCrafts() {
        return airCrafts;
    }

    public void setAirCrafts(List<Aircraft> airCrafts) {
        this.airCrafts = airCrafts;
    }
}
