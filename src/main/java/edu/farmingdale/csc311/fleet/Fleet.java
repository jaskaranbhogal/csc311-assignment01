package edu.farmingdale.csc311.fleet;

/**
 * A named group of vehicles stored in a plain array.
 * No ArrayList, no HashMap. Arrays and loops only.
 *
 * @author YOUR NAME HERE
 */
public class Fleet {

    public static final int MAX_VEHICLES = 25;

    /* ------------------------------------------------------------------
     * TODO-08     commit: TODO-08: implement Fleet storage
     *
     * 1. Add three private fields:
     *        name        String, final
     *        vehicles    Vehicle[], final, sized MAX_VEHICLES
     *        count       int, how many slots are actually used
     *
     * 2. The constructor checks name (not null, not blank) and trims it.
     *
     * 3. Methods:
     *
     *    contains(Vehicle v)
     *        loop over the used slots and return true if one equals v.
     *        Use the equals you wrote in TODO-05, not ==.
     *
     *    add(Vehicle v)
     *        null argument           throw IllegalArgumentException
     *        already in the fleet    return false, store nothing
     *        array full              return false
     *        otherwise               store at index count, count++, return true
     *
     *    removeByVin(String vin)
     *        find the slot whose VIN matches, ignoring case. Shift every
     *        later element one place left, null out the old last slot,
     *        count--, return true. Return false when nothing matched or
     *        the vin was null or blank.
     *
     *    findByVin(String vin)
     *        return the matching Vehicle, ignoring case, or null.
     *
     *    size()
     *        return count.
     *
     *    toArray()
     *        return a NEW array of length count holding the vehicles in
     *        insertion order. Returning the internal array lets a caller
     *        overwrite your slots, so copy it.
     * ------------------------------------------------------------------ */

    public Fleet(String name) {
        throw new UnsupportedOperationException("TODO-08");
    }

    public String getName() {
        throw new UnsupportedOperationException("TODO-08");
    }

    public boolean contains(Vehicle vehicle) {
        throw new UnsupportedOperationException("TODO-08");
    }

    public boolean add(Vehicle vehicle) {
        throw new UnsupportedOperationException("TODO-08");
    }

    public boolean removeByVin(String vin) {
        throw new UnsupportedOperationException("TODO-08");
    }

    public Vehicle findByVin(String vin) {
        throw new UnsupportedOperationException("TODO-08");
    }

    public int size() {
        throw new UnsupportedOperationException("TODO-08");
    }

    public Vehicle[] toArray() {
        throw new UnsupportedOperationException("TODO-08");
    }

    /* ------------------------------------------------------------------
     * TODO-09     commit: TODO-09: implement Fleet reports
     *
     * None of these may reorder or change the internal array. Start from
     * toArray() when you need a different order.
     *
     *    sortedByYear()
     *        a new array ordered by year, oldest first. When two years
     *        match, order by make A to Z ignoring case
     *        (String.compareToIgnoreCase). Write the sort yourself:
     *        selection sort or insertion sort, your choice. No Arrays.sort,
     *        no Comparator.
     *
     *    countWithFuelType(FuelType fuel)
     *        how many vehicles use that fuel.
     *
     *    averageEngineSize()
     *        average engine size over the vehicles whose fuel type has an
     *        engine. Electrics are left out, otherwise their 0.0 drags the
     *        number down and it means nothing. Return 0.0 when the count is
     *        zero, and watch the division.
     *
     *    longestRange()
     *        the vehicle with the largest rangeInMiles(), or null when the
     *        fleet is empty. On a tie keep the one added first. Note that
     *        this compares cars against trucks without a single if about
     *        the type: rangeInMiles() already knows which formula to run.
     * ------------------------------------------------------------------ */

    public Vehicle[] sortedByYear() {
        throw new UnsupportedOperationException("TODO-09");
    }

    public int countWithFuelType(FuelType fuel) {
        throw new UnsupportedOperationException("TODO-09");
    }

    public double averageEngineSize() {
        throw new UnsupportedOperationException("TODO-09");
    }

    public Vehicle longestRange() {
        throw new UnsupportedOperationException("TODO-09");
    }
}
