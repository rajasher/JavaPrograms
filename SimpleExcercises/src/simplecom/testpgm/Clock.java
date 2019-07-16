package simplecom.testpgm;

/*
Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
You should validate that the first parameter minutes is >= 0.
You should validate that the 2nd parameter seconds is >= 0 and <= 59.
The method should return gInvalid valueh in the method if either of the above are not true.
If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed
to this method and return that value as string in format gXXh YYm ZZsh where XX represents a number of hours,
YY the minutes and ZZ the seconds.

Create a 2nd method of the same name but with only one parameter seconds.
Validate that it is >= 0, and return gInvalid valueh if it is not true.
If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method
passing the correct minutes and seconds calculated so that it can calculate correctly.
Call both methods to print values to the console.
 */


public class Clock {

    private static final String INVALID_MSG = "Invalid Value";

    // return in hours, minutes and seconds (XXh YYm ZZs)
    public static String getDurationString (int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_MSG;
        }
        // we don't need since we are expecting seconds to be < 59
        //seconds = seconds % 60;
        //minutes += (seconds / 60);

        int hours = minutes / 60;
        minutes = minutes % 60;
        //return hours+"h "+minutes+"m "+seconds+"s";

        // if we have to return in XXh YYm ZZs (even when <10)
        String hoursString = hours + "h";
        if (hours < 10)
            hoursString = "0" + hoursString;

        String minString = minutes + "m";
        if (minutes < 10)
            minString = "0" + minString;

        String secString = seconds + "s";
        if (seconds < 10)
            secString = "0" + secString;

        return hoursString + " " + minString + " " + secString;
    }

    public static String getDurationString (int seconds) {
        if (seconds < 0) {
            return INVALID_MSG;
        }
        // convert into minutes and seconds
        return getDurationString(seconds/60, seconds%60);
    }

}
