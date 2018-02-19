public class Bicycle {

    // The bicylce class has
    // three fields
    public int cadence;
    public int gear;
    public int speed;

    // the bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // The bicylce class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}

public class MountainBike extends Bicycle{
    // The mountainBike subclass has
    // one field
    public int seatHeight;

    // The MountainBike subclass has
    // One constructor
    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear){
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // The MountainBike subclass has
    // one method
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
}