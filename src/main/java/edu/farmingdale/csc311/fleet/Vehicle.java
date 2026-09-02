package edu.farmingdale.csc311.fleet;

/**
 * Base class for everything the motor pool owns. Abstract on purpose:
 * the fleet holds cars and trucks, never a plain "vehicle".
 *
 * @author YOUR NAME HERE
 */
public abstract class Vehicle implements Honkable {

    /* ------------------------------------------------------------------
     * TODO-02     commit: TODO-02: add Vehicle fields and constructor
     *
     * Declare these nine private fields. Mark vin, make, model, fuelType
     * and engineSize final; they get no setters.
     *
     *      vin             String     17 characters
     *      make            String
     *      model           String
     *      year            int
     *      color           String
     *      wheels          int
     *      engineSize      double     liters
     *      fuelType        FuelType
     *      fuelCapacity    double     gallons, or kWh when electric
     *
     * Then write the constructor. Check every argument before you store it
     * and throw IllegalArgumentException when a rule is broken. The message
     * must name the field and show the bad value. Rules:
     *
     *      vin            not null, exactly 17 characters after trimming,
     *                     stored in upper case
     *      make           not null, not blank, stored trimmed
     *      model          same as make
     *      color          same as make
     *      year           1900 through 2100
     *      wheels         2 through 18
     *      fuelType       not null
     *      engineSize     when fuelType.hasEngine() is true: above 0.0 and
     *                     at most 8.5. Otherwise it must be exactly 0.0.
     *      fuelCapacity   above 0.0
     *
     * The make/model/color check is the same three times. Write it once as
     * a private static helper and call it three times.
     * ------------------------------------------------------------------ */

    protected Vehicle(String vin, String make, String model, int year, String color,
                      int wheels, double engineSize, FuelType fuelType, double fuelCapacity) {
        throw new UnsupportedOperationException("TODO-02");
    }

    /* ------------------------------------------------------------------
     * TODO-03     commit: TODO-03: add Vehicle getters and setters
     *
     * Fill in the getters. The four setters repeat the rules from TODO-02,
     * so have the constructor call the setters instead of writing each
     * check twice.
     * ------------------------------------------------------------------ */

    public String getVin() {
        throw new UnsupportedOperationException("TODO-03");
    }

    public String getMake() {
        throw new UnsupportedOperationException("TODO-03");
    }

    public String getModel() {
        throw new UnsupportedOperationException("TODO-03");
    }

    public int getYear() {
        throw new UnsupportedOperationException("TODO-03");
    }

    public void setYear(int year) {
        throw new UnsupportedOperationException("TODO-03");
    }

    public String getColor() {
        throw new UnsupportedOperationException("TODO-03");
    }

    public void setColor(String color) {
        throw new UnsupportedOperationException("TODO-03");
    }

    public int getWheels() {
        throw new UnsupportedOperationException("TODO-03");
    }

    public void setWheels(int wheels) {
        throw new UnsupportedOperationException("TODO-03");
    }

    public double getEngineSize() {
        throw new UnsupportedOperationException("TODO-03");
    }

    public FuelType getFuelType() {
        throw new UnsupportedOperationException("TODO-03");
    }

    public double getFuelCapacity() {
        throw new UnsupportedOperationException("TODO-03");
    }

    public void setFuelCapacity(double fuelCapacity) {
        throw new UnsupportedOperationException("TODO-03");
    }

    /* ------------------------------------------------------------------
     * TODO-04     commit: TODO-04: implement honk methods from Honkable
     *
     * Vehicle says "implements Honkable" but supplies no horn code yet.
     *
     *      honk()          print hornSound() on one line
     *      honk(int)       print hornSound() that many times, one per line.
     *                      Throw IllegalArgumentException when times < 1.
     *
     * Do not implement hornSound() here. Car and Truck each answer it,
     * and honk() calls whichever one the object actually is.
     * ------------------------------------------------------------------ */

    @Override
    public void honk() {
        throw new UnsupportedOperationException("TODO-04");
    }

    @Override
    public void honk(int times) {
        throw new UnsupportedOperationException("TODO-04");
    }

    /** Subclasses answer these two. Do not write bodies here. */
    public abstract String category();

    public abstract double rangeInMiles();

    /* ------------------------------------------------------------------
     * TODO-05     commit: TODO-05: add toString, equals and hashCode
     *
     * toString() returns exactly this shape, built with String.format:
     *
     *   2023 Honda Accord [VIN=1HGCM82633A004352] color=Blue, wheels=4,
     *   engine=2.0L, fuel=Gasoline, capacity=15.8 gallons
     *
     * (one line, no period at the end). When fuelType.hasEngine() is false
     * the engine part reads engine=n/a instead of a number. Use getLabel()
     * for the fuel and getUnit() after the capacity.
     *
     * Two vehicles are equal when their VINs match. Follow the usual steps:
     * same object, then instanceof, then compare the VIN strings.
     * Base hashCode on the VIN so it agrees with equals.
     * ------------------------------------------------------------------ */

    @Override
    public String toString() {
        throw new UnsupportedOperationException("TODO-05");
    }

    @Override
    public boolean equals(Object other) {
        throw new UnsupportedOperationException("TODO-05");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("TODO-05");
    }
}
