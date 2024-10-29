package domain;

import domain.AirPort;


import java.util.Date;


public class TakeOff {

    private long takeOff_id;


    AirPort takeOffLocation;
    Date takeOffTime;

    public long getTakeOff_id() {
        return takeOff_id;
    }

    public void setTakeOff_id(long takeOff_id) {
        this.takeOff_id = takeOff_id;
    }

    public AirPort getTakeOffLocation() {
        return takeOffLocation;
    }

    public void setTakeOffLocation(AirPort takeOffLocation) {
        this.takeOffLocation = takeOffLocation;
    }

    public Date getTakeOffTime() {
        return takeOffTime;
    }

    public void setTakeOffTime(Date takeOffTime) {
        this.takeOffTime = takeOffTime;
    }
}
