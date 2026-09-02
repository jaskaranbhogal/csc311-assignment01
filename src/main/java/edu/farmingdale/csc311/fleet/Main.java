package edu.farmingdale.csc311.fleet;

/**
 * Driver. This is the only class that prints a report.
 *
 * @author YOUR NAME HERE
 */
public class Main {

    /* ------------------------------------------------------------------
     * TODO-10     commit: TODO-10: build the fleet demo in Main
     *
     * Print exactly the output listed in the assignment handout. Break the
     * work into private static helper methods, one per section. A 120 line
     * main() loses points.
     *
     * 1. Build a Fleet named "Farmingdale Motor Pool" and add these five in
     *    this order. Every value matters.
     *
     *    Car   1HGCM82633A004352 Honda  Accord  2023 Blue   4 2.0 GASOLINE 15.8 4 doors
     *    Car   5YJ3E1EA7PF123456 Tesla  Model 3 2024 Red    4 0.0 ELECTRIC 75.0 4 doors
     *    Car   JTDKARFU2J3061234 Toyota Prius   2020 Silver 4 1.8 HYBRID   11.3 5 doors
     *    Truck 1FT8W3BT5MEC12345 Ford   F-350   2021 White  6 6.7 DIESEL   40.0 3500.0 kg
     *    Truck 3C6UR5DL9JG123456 Ram    2500    2019 Black  4 6.4 GASOLINE 31.0 1800.0 kg
     *
     * 2. Inventory: loop over sortedByYear() and println each one. Declare
     *    the loop variable as Vehicle, not Car and not Truck. One loop
     *    prints both kinds. No instanceof anywhere in this file.
     *
     * 3. Sound check: loop over sortedByYear() again with the loop variable
     *    declared as Honkable and call honk(). Then find the Accord with
     *    findByVin and honk 3 times.
     *
     * 4. Report, using these exact printf formats:
     *        "%-20s: %d%n"                     vehicle count
     *        "%-20s: %.1f L%n"                 average engine size
     *        "%-20s: %d %s %s (%.1f mi)%n"     longest range
     *        "  %-9s: %d%n"                    one line per fuel
     *    Get the fuel lines by looping over FuelType.values() and calling
     *    countWithFuelType.
     *
     * 5. Guard rails, first three lines with "%-23s: %s%n":
     *        a. add the Accord a second time, print what add() returned
     *        b. removeByVin the Prius, print what it returned
     *        c. print size() afterwards
     *    Then three separate try/catch blocks, each catching
     *    IllegalArgumentException and printing "Caught: " + e.getMessage():
     *        d. build a Car with fuel ELECTRIC and engine size 2.0
     *        e. FuelType.fromLabel("Steam")
     *        f. honk(0) on any vehicle
     *    Catch IllegalArgumentException, not Exception. No empty catch.
     * ------------------------------------------------------------------ */

    public static void main(String[] args) {
        System.out.println("TODO-10: build the fleet demo. See the handout for the expected output.");
    }
}
