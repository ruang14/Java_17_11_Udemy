package main;

public class MethodOverloading {

    //Method Overloading is where you use the same method name as an already declared method, but with different parameters
    //Simply changing the return type is not Method Overloading and will not work

    //Method Overloading improves code readability and re-usability.
    //It is easier to remember one method name instead of multiple.
    //Achieves consistency in naming. One name for methods that are commonly used.
    //Overloaded methods give programmers the flexibility to call a similar method with different types of data.

    public static void main(String[] args) {
        int newScore = calculateScore("Sassie", 500);
        System.out.println("new score = " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeter(-10));


        System.out.println(getDurationString(3691));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");

        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");

        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name and no player score");

        return 0;
    }

    //Challenge

    public static double calcFeetAndInchesToCentimeter(double feet, double inches) {
        if (feet < 0) return -1;
        if (inches < 0 || inches > 12) return -1;

        return ((feet * 12) * 2.54) + (inches * 2.54);
    }

    public static double calcFeetAndInchesToCentimeter(double inches) {
        if (inches < 0) return -1;

        return calcFeetAndInchesToCentimeter((int) (inches / 12), (int) (inches % 12));
    }

    //Seconds and Minutes Challenge
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) return INVALID_VALUE_MESSAGE;

        int hours = minutes / 60;
        minutes = minutes % 60;

        String hString;
        String mString;
        String sString;

        if (hours < 10) {
            hString = String.format("0%sh", hours);
        } else {
            hString = String.format("%sh", hours);
        }
        if (minutes < 10) {
            mString = String.format("0%sm", minutes);
        } else {
            mString = String.format("%sm", minutes);
        }
        if (seconds < 10) {
            sString = String.format("0%ss", seconds);
        } else {
            sString = String.format("%ss", seconds);
        }

        return String.format("%s %s %s", hString, mString, sString);
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) return INVALID_VALUE_MESSAGE;

        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);
    }
    //

}
