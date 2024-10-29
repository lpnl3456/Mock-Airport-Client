package domain;

import domain.AirPort;

import java.util.Date;


public class Landing {

    private long landing_id;
    AirPort landingLocation;
   Date landingTime;

    public long getLanding_id() {
        return landing_id;
    }

    public void setLanding_id(long landing_id) {
        this.landing_id = landing_id;
    }

    public AirPort getLandingLocation() {
        return landingLocation;
    }

    public void setLandingLocation(AirPort landingLocation) {
        this.landingLocation = landingLocation;
    }

    public Date getLandingTime() {
        return landingTime;
    }

    public void setLandingTime(Date landingTime) {
        this.landingTime = landingTime;
    }



}
