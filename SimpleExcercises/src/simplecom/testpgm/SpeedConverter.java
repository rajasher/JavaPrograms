package simplecom.testpgm;

/*
    Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour.
    This method needs to return the rounded value of the calculation of type long.

    Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
    This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour
    parameter. Then it needs to print a message in the format "XX km/h = YY mi/h".

    1 km = 1.609 miles
 */

public class SpeedConverter {

    private static long toMilesPerHour (double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }

        double milesPerHour = kilometersPerHour/1.609;
        return Math.round(milesPerHour);
    }

    public static void printConversion(double kilometersPerHour) {

        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
