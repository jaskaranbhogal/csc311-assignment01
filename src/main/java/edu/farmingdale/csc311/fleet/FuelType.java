package edu.farmingdale.csc311.fleet;

/**
 * The fuels a fleet vehicle can run on.
 *
 * @author YOUR NAME HERE
 */
public enum FuelType {

    /* ------------------------------------------------------------------
     * TODO-01     commit: TODO-01: add FuelType data and lookup
     *
     * Each constant carries three values:
     *
     *      constant   label        unit        milesPerUnit
     *      GASOLINE   "Gasoline"   "gallons"   28.0
     *      DIESEL     "Diesel"     "gallons"   34.0
     *      ELECTRIC   "Electric"   "kWh"        3.2
     *      HYBRID     "Hybrid"     "gallons"   48.0
     *
     * Pass those values to each constant, add three private final fields,
     * write the constructor, then finish the five methods below.
     * ------------------------------------------------------------------ */

    GASOLINE,
    DIESEL,
    ELECTRIC,
    HYBRID;

    public String getLabel() {
        throw new UnsupportedOperationException("TODO-01");
    }

    public String getUnit() {
        throw new UnsupportedOperationException("TODO-01");
    }

    public double getMilesPerUnit() {
        throw new UnsupportedOperationException("TODO-01");
    }

    /** False for ELECTRIC, true for the rest. */
    public boolean hasEngine() {
        throw new UnsupportedOperationException("TODO-01");
    }

    /**
     * Finds a constant by its label, ignoring case and outer spaces.
     * Throws IllegalArgumentException if the text matches nothing.
     */
    public static FuelType fromLabel(String text) {
        throw new UnsupportedOperationException("TODO-01");
    }
}
