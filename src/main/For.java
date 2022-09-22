package main;

public class For {

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000.0, 2.0));
        System.out.println(calculateInterest(10000.0, 3.0));
        System.out.println(calculateInterest(10000.0, 4.0));
        System.out.println(calculateInterest(10000.0, 5.0));

        // for (init; termination; increment) -- basic structure of a for loop

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i);
        }

        for (int i = 2; i < 9; i++) {
            System.out.println("Interest " + i + " " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        for (int i = 8; i > 1; i--) {
            System.out.println("Interest " + i + " " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        int count = 0;
        for(int i = 0; i < 10; i++){
            if(isPrime(i)) {
                System.out.println(i + " is Prime");
                count++;
            }
            if (count == 3) break;
        }

        System.out.println("*****************");
        int sum = 0;
        count = 1;
        for(int i = 1; i < 1001; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println(i);
                sum += i;

                if(count++ == 5) break;
            }
        }

        System.out.println("sum = " + sum);
        System.out.println("*****************");
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n){
        if(n == 1) return false;

        for(int i = 2; i <= Math.log(n); i++){
            if(n % i == 0) return false;
        }

        return true;
    }

}
