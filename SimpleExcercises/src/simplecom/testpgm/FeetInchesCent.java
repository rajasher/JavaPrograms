package simplecom.testpgm;

public class FeetInchesCent {

    // method overloading

    public static double calcFeetAndInchesToCentimeter(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }

        double newInches = inches + feet * 12;
        double centimeters = newInches * 2.54;
        System.out.println(feet + "feet and " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double  calcFeetAndInchesToCentimeter(double inches) {
        if (inches < 0) {
            return -1;
        }
        // convert into feet and inches
        // note the casting (from double to int) - since we are breaking into feet and inches
        return calcFeetAndInchesToCentimeter((int)inches/12, (int)inches%12);
    }

}
