package simplecom.testpgm;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        BarkingDog.shouldWakeUp (true, 1);
        BarkingDog.shouldWakeUp (false, 2);
        BarkingDog.shouldWakeUp (true, 8);
        BarkingDog.shouldWakeUp (true, -1);

        System.out.println(LeapYear.isLeapYear(-1600));
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2000));
        System.out.println(LeapYear.isLeapYear(2017));

        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.175, 3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));

        FeetInchesCent.calcFeetAndInchesToCentimeter(30);
        FeetInchesCent.calcFeetAndInchesToCentimeter(30);

        System.out.println(Clock.getDurationString(76, 20));
        System.out.println(Clock.getDurationString(96));
        System.out.println(Clock.getDurationString(61, 0));
    }
}
