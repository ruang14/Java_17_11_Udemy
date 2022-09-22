package main;

public class Switch {

    public static void main(String[] args) {
        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("one");
                break; // if you do not use a break, the logic will follow through until it reaches a break statement or the end of the switch
            case 2:
                System.out.println("two");
                break;
            case 3, 4, 5:
                System.out.println("three or four or five");
                break;
            default:
                System.out.println("not one or two");
                break; // technically no break needed here since it's the last statement in the switch
        }

        //Challenge
        char c = 'A';

        switch (c) {
            case 'A':
                System.out.println('A');
                break;
            case 'B':
                System.out.println('B');
                break;
            default:
                System.out.println("Invalid");
        }
        //

        String month = "January";

        switch (month.toLowerCase()) {
            case "january" -> System.out.println("Happy birthday");
            case "february" -> System.out.println("Not birthday");
            default -> System.out.println("wat");
        }
    }

    //Challenge
    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid day");
        }
    }
    //

    private static void printDayOfTheWeek_arr(int day) {
        if(day > 6 || day < 0) {
            System.out.println("Invalid day");
            return;
        }

        String[] daysOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println(daysOfTheWeek[day]);
    }

}
