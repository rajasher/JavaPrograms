package simplecom.testpgm;

/*
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double
numbers are the same up to three decimal places. Otherwise, return false.
 */

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        String str1 = "" + num1;
        String str2 = String.valueOf(num2);
        int decimal = str1.indexOf('.');
        if (decimal == str2.indexOf('.')) {

            String subStr1 = str1.substring(0, Math.min(decimal+3,str1.length()-1)+1);
            System.out.println(subStr1);
            if (subStr1.equals(str2.substring(0, Math.min(decimal+3,str2.length()-1)+1))) {
                return true;
            }
        }
        return false;
    }

}
