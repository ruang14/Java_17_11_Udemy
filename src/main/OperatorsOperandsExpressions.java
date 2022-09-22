package main;

public class OperatorsOperandsExpressions {

    //Operators in Java are special symbols that perform specific operations on one, two, or three operands, and then return a result.

    //An operand is a term used to describe any object that is manipulated by an operator.
    //Example: Given the following statement:
    //  int i = 15 + 12;
    //Then + is the operator, and 15 and 12 are the operands.
    //Variables used instead of literals are also operands
    //  double salary = hoursWorked * hourlyRate;
    //hoursWorked and hourlyRate are operands, and * is the operator.

    //An expression is formed by combining variables, literals, method return values, and operators.
    //  int i = 15 + 12; -> expression
    //  double salary =  hoursWorked * hourlyRate; -> expression

    //The if-then statement is the most basic of all the control flow statements. It tells your program to execute a certain section of code only if a particular test evaluates to true.
    //This is known as conditional logic.
    //Conditional logic uses specific statements in Java to allow us to check a condition and execute certain code based on whether that condition (expression) is true or false.

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int prevResult = result;
        System.out.println("prevResult = " + prevResult);

        result += -1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("prevResult = " + prevResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        //result  = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3;
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        //result = result - 2;
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false; // = is an assignment operator, it assigns the value of an expression to the variable on the left of the = operator
        if (!isAlien) { // == operator asks if the operands on either side are identical or equal to each other
            System.out.println("It is not an alien.");
        }

        int topScore = 100;

        if(topScore >= 100){
            System.out.println("Top Score");
        }

        int secondTopScore = 80;
        if((topScore > secondTopScore) && (topScore <= 100)){ // AND (&&) operator requires both operands to be true to enter code block
            System.out.println("Greater than second top score and less than or equal to 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)){ // OR (||) operator requires only one operand on either side to be true to enter code block
            System.out.println("Either topScore > 90 or secondTopScore <= 90 or both");
        }

        int iValue = 50;//= is an assignment operator
        if(iValue == 50){//== is an equal to operator
            System.out.println("true");
        }

        boolean isCar = false;
        if(!isCar){//! is the not operator, aka Logical Compliment Operator, for use with booleans it tests the alternate value
            System.out.println("wat");
        }

        //The Ternary operator is a shortcut to assigning one of two values to a variable depending on a given condition.
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar");
        }

        int age = 20;
        boolean isEighteenOrOver = (age >= 18) ? true : false;

        //Java Operator Precedence Table -> https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
        //Shows how Java decides the priority of evaluating things in an expression

        //Challenge

        double d = 20.00d;
        double dd = 80.00d;

        double ddd = (d + dd) * 100.00d;

        double dddd = (ddd % 40);

        boolean b = (dddd == 0) ? true : false;

        System.out.println("mod == 0 :" + b);

        if(!b){
            System.out.println("Got some remainder: " + dddd);
        }

    }

}
