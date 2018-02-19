import java.util.Date;

/**
 * Planet is an immutable class, since there is no way to change
 * its state after construction.
 */

public final class Planet {
    public Planet (double aMass, String aName, Date aDateOfDiscovery){
        fMass = aMass;
        fName = aName;
        //make a private copy of aDateOfDiscovery
        //this is the only way to keep the fDateOfDiscovery
        //field private, and shields this class from any changes that
        //the caller may make to the original aDateOfDiscovery object
        fDateOfDiscovery = new Date(aDateOfDiscovery.getTime());

    }

    public double getMass(){
        return fmass;
    }

    public String getName(){
        return fName;
    }

      /**
  * Returns a mutable object - good style.
  * 
  * Returns a defensive copy of the field.
  * The caller of this method can do anything they want with the
  * returned Date object, without affecting the internals of this
  * class in any way. Why? Because they do not have a reference to 
  * fDate. Rather, they are playing with a second Date that initially has the 
  * same data as fDate.
  */

    public Date getDateOfDiscovery(){
        return new Date(fDateOfDiscovery.getTime());
    }
    private final double fmass;
    private final String fname;
    private final Date fDateOfDiscovery;
}