package edu.farmingdale.csc311.fleet;

/**
 * A work truck. Its range drops as its payload rating goes up, so it
 * computes range differently from a Car.
 *
 * @author Jaskaran Bhogal
 */
public class Truck extends Vehicle {

    private double payloadKg;

    /* ------------------------------------------------------------------
     * TODO-07     commit: TODO-07: implement Truck
     *
     * 1. Add a private double field payloadKg.
     * 2. After the super(...) call, check payloadKg (above 0.0, at most
     *    20000.0) and store it.
     * 3. Fill in getPayloadKg() and setPayloadKg(double) with the same check.
     * 4. category()     returns "Truck"
     *    hornSound()    returns "HOOOONK!"
     *    honk()         a truck answers one honk() with two blasts.
     *                   Override it and call honk(2). Do not copy the
     *                   printing code from Vehicle.
     *    rangeInMiles()
     *        loadFactor = 1.0 - Math.min(0.35, payloadKg / 20000.0)
     *        range      = getFuelCapacity() * getFuelType().getMilesPerUnit() * loadFactor
     * 5. toString() returns:
     *
     *      Truck -> <what Vehicle.toString() gives>, payload=3500.0 kg, range=1122.0 mi
     *
     *    Same rules as Car: super.toString(), category(), one decimal.
     * ------------------------------------------------------------------ */

    public Truck(String vin, String make, String model, int year, String color,
                 int wheels, double engineSize, FuelType fuelType, double fuelCapacity, double payloadKg) {

        super(vin, make, model, year, color, wheels, engineSize, fuelType, fuelCapacity);

        setPayloadKg(payloadKg);
    }

    public double getPayloadKg() {
        return payloadKg;
    }

    public void setPayloadKg(double payloadKg) {
        if (payloadKg <= 0.0 || payloadKg > 20000.0) {
            throw new IllegalArgumentException("payloadKg: " + payloadKg);
        }

        this.payloadKg = payloadKg;
    }

    @Override
    public String category() {
        return "Truck";
    }

    @Override
    public String hornSound() {
        return "HOOOONK!";
    }

    @Override
    public void honk() {
        honk(2);
    }

    @Override
    public double rangeInMiles() {
        double loadFactor = 1.0 - Math.min(0.35, payloadKg / 20000.0);
        return getFuelCapacity() * getFuelType().getMilesPerUnit() * loadFactor;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s, payload=%.1f kg, range=%.1f mi",
                category(), super.toString(), payloadKg, rangeInMiles());
    }
}
