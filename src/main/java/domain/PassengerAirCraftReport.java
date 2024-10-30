package domain;

import java.util.List;

public class PassengerAirCraftReport {

    private Passenger passenger;
    private List <AirCraft> airCrafts;

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public List<AirCraft> getAirCrafts() {
        return airCrafts;
    }

    public void setAirCrafts(List<AirCraft> airCrafts) {
        this.airCrafts = airCrafts;
    }
}
