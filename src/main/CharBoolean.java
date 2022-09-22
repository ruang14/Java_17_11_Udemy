package main;

public class CharBoolean {

    //A char occupies two bytes of memory, or 16 bits, and thus has a width of 16.
    //The reason it's not just a single byte is that it allows you to store Unicode characters.
    //Unicode is an international encoding standard for use with different languages and scripts, by which each letter, digit, or symbol is assigned a unique numeric value that applies across different platforms and programs.
    //In the English alphabet, we have the letters A - Z, meaning only 26 characters are needed in total to represent the entire English alphabet, but other languages need more characters.
    //Unicode allows us to represent these languages, and the way it works is that by using a combination of the two bytes that a char takes up in memory, it can represent one of 65535 different types of characters.
    //https://unicode-table.com/en/

    //A boolean value allows for two choices, True or False, Yes or No, 1 or 0.
    //In Java terms we have a boolean primitive type, and it can be set to two values only, true or false.

    public static void main(String[] args) {
        char c = 'D';
        char unicode = '\u0044';

        System.out.println("c = " + c);
        System.out.println("unicode = " + unicode);

        char uniCopyright = '\u00A9';

        System.out.println("uniCopyright = " + uniCopyright);

        boolean t = true;
        boolean f = false;

        boolean isCustomerOver21 = true;
    }

}
