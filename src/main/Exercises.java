package main;

public class Exercises {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    //Speed Converter-------------------------------------------------
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) return -1;

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.printf("%s km/h = %s mi/h%n", kilometersPerHour, toMilesPerHour(kilometersPerHour));
        }
    }
    //----------------------------------------------------------------

    //MegaBytes Converter---------------------------------------------
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int rKiloBytes = kiloBytes - (megaBytes * 1024);

            System.out.printf("%s KB = %s MB and %s KB", kiloBytes, megaBytes, rKiloBytes);
            System.out.println();
        }
    }
    //----------------------------------------------------------------

    //Barking Dog-----------------------------------------------------
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23) return false;

        return (hourOfDay < 8 || hourOfDay > 22) && barking;
    }
    //----------------------------------------------------------------

    //Leap Year-------------------------------------------------------
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999) return false;

        return year % 4 == 0 && year % 100 == 0 && year % 400 == 0;
    }
    //----------------------------------------------------------------

    //Decimal Comparator----------------------------------------------
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        return (int)(num1 * 1000) == (int)(num2 * 1000);
    }
    //----------------------------------------------------------------

    //Equal Sum Checker-----------------------------------------------
    public static boolean hasEqualSum(int num1, int num2, int num3){
        return (num1 + num2) == num3;
    }
    //----------------------------------------------------------------

    //Teen Number Checker---------------------------------------------
    public static boolean hasTeen(int num1, int num2, int num3){
        return (num1 > 12 && num1 < 20) || (num2 > 12 && num2 < 20) || (num3 > 12 && num3 < 20);
    }

    public static boolean isTeen(int num1){
        return num1 > 12 && num1 < 20;
    }
    //----------------------------------------------------------------

    //Area Calculator-------------------------------------------------
    public static double area(double radius){
        if(radius < 0) return -1;

        return radius * (radius * Math.PI);
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0) return -1;

        return x * y;
    }
    //----------------------------------------------------------------

    //Minutes to Years and Days Calculator----------------------------
    public static void printYearsAndDays(long minutes){
        if(minutes < 0) System.out.println("Invalid Value");

        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        days = days % 24;

        System.out.printf("%s min = %s y and %s d", minutes, years, days);
    }
    //----------------------------------------------------------------

    //Equality Printer------------------------------------------------
    public static void printEqual(int num1, int num2, int num3){
        if(num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");
        } else if(num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if(num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
    //----------------------------------------------------------------

    //Playing Cat-----------------------------------------------------
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(temperature > 24 && temperature < 36 && !summer) return true;
        if(temperature > 24 && temperature < 46 && summer) return true;
        return false;
    }
    //----------------------------------------------------------------

}
