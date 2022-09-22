package main;

//The public keyword is an access modifier. This allows us to define the scope of how other parts of your code can access this code.

//The class keyword is used to define a class with a name following the keyword, Hello in this case. The left and right curly braces define the class block.

//So to define a class, we require an optional access modifier (public), followed by the keyword class, followed by a name for the class, and finally followed by the left and right curly braces.

//The left and right curly braces define the class body. Everything inside the curly braces are a part of this class.

public class Hello {

    //A method is a collection of statements that performs an operation.

    //The main method is a special method that Java looks for when running a program. It is the entry point of any Java application.

    //The left and right parentheses of the method are mandatory and can optionally include one or more parameters. This way we can pas information to the method.

    //The left and right curly braces define the code block. The code block is used to define  a block of code. It is mandatory to have a code block in a method declaration as this is where statements will be added to perform certain operations.

    //A statement is a complete command to be executed and can include one or more expressions.

    //Variables are a way we can store information in our computer. Variables that we define in a program can be accessed by a name we give them, and the computer does the hard work of figuring out where they get stored in the RAM.

    //A variable can be changed, meaning it's contents are variable.

    //We have to tell the computer what type of information we want to store in the variable, and give it a name.

    //There are lots of different types of data we can define for our variables. Collectively, these are known as Data Types, and these are keywords in Java.

    //A Declaration Statement is used to define a variable by indicating the data type, the name, and optionally to set the variable to a certain value;
    //Example: int num = 5;
    //Data Type is an int (integer), the name is num, and the value we are assigning or initializing our variable with is 5.
    //We are declaring a variable of type int, with the name num, and assigning the value 5 to it.

    //An Expression is basically a construct that evaluates to a single value.

    //A String Literal is any sequence of characters surrounded by double quotes.

    //Java Operators perform an operation on a variable or value. +, -, *, / are four common operators.

    //In Java Primitive Types are the most basic Data Types.
    //The eight Primitive Data Types in Java are:
    // 1. boolean
    // 2. byte
    // 3. char
    // 4. short
    // 5. int
    // 6. long
    // 7. float
    // 8. double
    //Consider these Data Types the building blocks of data manipulation.

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int num = (5 + 10) + (2 * 10);
        int num2 = 12;
        int num3 = num * 2;
        int total = num + num2 + num3;
        int num4 = 1000 - total;

        System.out.println(total);
        System.out.println(num4);
    }

}
