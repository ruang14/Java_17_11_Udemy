package main;

public class While {

    public static void main(String[] args) {
//        int count = 1;
//
//        while (count != 6) {
//            System.out.println("Count = " + count++);
//        }
//
//        System.out.println("====================");
//
//        count = 5;
//        do { // do while is guaranteed to execute at least once, in this case, when count is = 6, the count increments in the loop and the while condition is never met
//            System.out.println("Count = " + count++);
//        } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int evenNumbers = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number = " + number);
            if(++evenNumbers == 5) break;
        }
        System.out.println("Total even numbers = " + evenNumbers);
    }

    //Challenge
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
    //

}
