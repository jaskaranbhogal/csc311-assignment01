package edu.farmingdale.csc311.fleet;

/**
 * A passenger car: a Vehicle plus a door count.
 *
 * @author YOUR NAME HERE
 */
public class Car extends Vehicle {

    /* ------------------------------------------------------------------
     * TODO-06     commit: TODO-06: implement Car
     *
     * 1. Add a private int field doors.
     * 2. The super(...) call is written for you and has to stay first.
     *    After it, check doors (must be 2, 3, 4 or 5) and store it.
     * 3. Fill in getDoors() and setDoors(int) with the same check.
     * 4. category()      returns "Car"
     *    rangeInMiles()  getFuelCapacity() * getFuelType().getMilesPerUnit()
     *    hornSound()     returns "Beep beep!"
     * 5. toString() returns:
     *
     *      Car -> <what Vehicle.toString() gives>, doors=4, range=442.4 mi
     *
     *    Call super.toString() for the middle part. Do not retype the
     *    parent's format string. Use category() instead of the literal
     *    "Car". Both numbers print with one decimal.
     * ------------------------------------------------------------------ */

    public Car(String vin, String make, String model, int year, String color,
               int wheels, double engineSize, FuelType fuelType, double fuelCapacity, int doors) {

        super(vin, make, model, year, color, wheels, engineSize, fuelType, fuelCapacity);

        // TODO-06 step 2: check and store doors here.
    }

    public int getDoors() {
        throw new UnsupportedOperationException("TODO-06");
    }

    public void setDoors(int doors) {
        throw new UnsupportedOperationException("TODO-06");
    }

    @Override
    public String category() {
        throw new UnsupportedOperationException("TODO-06");
    }

    @Override
    public double rangeInMiles() {
        throw new UnsupportedOperationException("TODO-06");
    }

    @Override
    public String hornSound() {
        throw new UnsupportedOperationException("TODO-06");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("TODO-06");
    }
}
