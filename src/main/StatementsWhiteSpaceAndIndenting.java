package main;

public class StatementsWhiteSpaceAndIndenting {

    // int myVariable = 50; -> statement is the entire line
    // myVariable++; -> statement is the entire line
    // System.out.println("This is a test"); -> statement is the entire line
    // System.out.println("This" +
    //                " is" +
    //                " another" +
    //                " test."); -> the whole thing is a statement
    // int anotherVariable = 50; myVariable--; System.out.println("Another one"); -> 3 statements on one line, gross

    //The semicolon (;) is needed in Java to complete a statement, but there are exceptions
    //Statements do not have to be in one line
    //Multiple statements can also be on one line, but this can get confusing

    //The use of whitespace and indentation is to make it easier to see the logic of flow of the code

    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This" +
                " is" +
                " another" +
                " test.");

        int anotherVariable = 50; myVariable--; System.out.println("Another one");
    }

}
