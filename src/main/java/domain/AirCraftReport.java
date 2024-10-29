package domain;

import java.util.List;

public class AirCraftReport {

    private AirCraft airCraft;
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

    public AirCraft getAirCraft() {
        return airCraft;
    }

    public void setAirCraft(AirCraft airCraft) {
        this.airCraft = airCraft;
    }
}
