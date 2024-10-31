package domain;

import java.util.List;

public class AircraftReport {

    private Aircraft aircraft;
    private List<AirPort> airports;


    public List<AirPort> getAirports() {
        return airports;
    }

    public void setAirports(List<AirPort> airports) {
        this.airports = airports;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }


    public void setAircraft(Aircraft airCraft) {
        this.aircraft = airCraft;
    }

}
