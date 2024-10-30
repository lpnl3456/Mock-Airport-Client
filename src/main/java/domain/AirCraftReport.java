package domain;

import java.util.List;

public class AirCraftReport {

    private AirCraft aircraft;
    private List<AirPort> airports;


    public List<AirPort> getAirports() {
        return airports;
    }

    public void setAirports(List<AirPort> airports) {
        this.airports = airports;
    }



    public AirCraft getAirCraft() {
        return aircraft;
    }

    public void setAirCraft(AirCraft airCraft) {
        this.aircraft = airCraft;
    }
}
