package edu.farmingdale.csc311.fleet;

/**
 * Driver. This is the only class that prints a report.
 *
 * @author Jaskaran Bhogal
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
        Fleet fleet = buildFleet();

        System.out.println("=== " + fleet.getName() + " ===");
        System.out.println();

        printInventory(fleet);
        System.out.println();

        printSoundCheck(fleet);
        System.out.println();

        printImpatientAccord(fleet);
        System.out.println();

        printFleetReport(fleet);
        System.out.println();

        printGuardRails(fleet);
    }

    private static Fleet buildFleet() {
        Fleet fleet = new Fleet("Farmingdale Motor Pool");

        fleet.add(new Car(
                "1HGCM82633A004352", "Honda", "Accord", 2023, "Blue",
                4, 2.0, FuelType.GASOLINE, 15.8, 4));

        fleet.add(new Car(
                "5YJ3E1EA7PF123456", "Tesla", "Model 3", 2024, "Red",
                4, 0.0, FuelType.ELECTRIC, 75.0, 4));

        fleet.add(new Car(
                "JTDKARFU2J3061234", "Toyota", "Prius", 2020, "Silver",
                4, 1.8, FuelType.HYBRID, 11.3, 5));

        fleet.add(new Truck(
                "1FT8W3BT5MEC12345", "Ford", "F-350", 2021, "White",
                6, 6.7, FuelType.DIESEL, 40.0, 3500.0));

        fleet.add(new Truck(
                "3C6UR5DL9JG123456", "Ram", "2500", 2019, "Black",
                4, 6.4, FuelType.GASOLINE, 31.0, 1800.0));

        return fleet;
    }

    private static void printInventory(Fleet fleet) {
        System.out.printf("-- Inventory (%d vehicles, sorted by year then make) --%n", fleet.size());

        for (Vehicle vehicle : fleet.sortedByYear()) {
            System.out.println(vehicle);
        }
    }

    private static void printSoundCheck(Fleet fleet) {
        System.out.println("-- Sound check --");

        for (Honkable horn : fleet.sortedByYear()) {
            horn.honk();
        }
    }

    private static void printImpatientAccord(Fleet fleet) {
        System.out.println("-- Impatient Accord --");

        Vehicle accord = fleet.findByVin("1HGCM82633A004352");
        accord.honk(3);
    }

    private static void printFleetReport(Fleet fleet) {
        System.out.println("-- Fleet report --");

        System.out.printf("%-20s: %d%n", "Vehicles", fleet.size());
        System.out.printf("%-20s: %.1f L%n", "Average engine size", fleet.averageEngineSize());

        Vehicle longest = fleet.longestRange();
        System.out.printf("%-20s: %d %s %s (%.1f mi)%n",
                "Longest range",
                longest.getYear(),
                longest.getMake(),
                longest.getModel(),
                longest.rangeInMiles());

        System.out.println("Fuel mix:");

        for (FuelType fuel : FuelType.values()) {
            System.out.printf("  %-9s: %d%n", fuel.getLabel(), fleet.countWithFuelType(fuel));
        }
    }

    private static void printGuardRails(Fleet fleet) {
        System.out.println("-- Guard rails --");

        Vehicle accord = fleet.findByVin("1HGCM82633A004352");
        boolean duplicateRejected = !fleet.add(accord);
        boolean removedPrius = fleet.removeByVin("JTDKARFU2J3061234");

        System.out.printf("%-23s: %s%n", "Duplicate VIN rejected", duplicateRejected);
        System.out.printf("%-23s: %s%n", "Removed the Prius", removedPrius);
        System.out.printf("%-23s: %s%n", "Fleet size now", fleet.size());

        try {
            new Car(
                    "TESTVIN1234567890", "Test", "Invalid", 2025, "Gray",
                    4, 2.0, FuelType.ELECTRIC, 75.0, 4);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            FuelType.fromLabel("Steam");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            accord.honk(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
