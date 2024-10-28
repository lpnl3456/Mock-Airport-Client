package domain;

import com.keyin.rest.Airport.AirPort;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class TakeOff {
    @Id
    @SequenceGenerator(name = "takeOff_sequence", sequenceName = "takeOff_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "takeOff_sequence")
    private long takeOff_id;

    @ManyToOne
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
