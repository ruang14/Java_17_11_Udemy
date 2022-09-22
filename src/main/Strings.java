package main;

public class Strings {

    //8 primitive data types:
    // byte (range = -128 -> 127)
    // short
    // int
    // long
    // float
    // double
    // char
    // boolean

    //The String is a datatype in Java, which is not a primitive type. It is actually a class.
    //A String is a sequence of characters which is technically limited by the memory or the MAX_VALUE of an int.

    //Strings in Java are immutable.
    //That means you can't change a String after it's created, instead, a new String is created.

    public static void main(String[] args) {
        String s = "bananas";

        System.out.println("String s = " + s);

        s = s + ", apples";

        System.out.println("String s+ = " + s);

        s += " \u00A9 2022";

        System.out.println("String s++ =" + s);

        String num = "250.55";
        num += "49.95";

        System.out.println("String num = " + num);

        String l = "10";
        int i = 50;
        l += i;

        System.out.println("String l = " + l);

        //In the case of the code below, String l doesn't get appended the value "120.47", instead a new String is created which consists of the previous value of String l, plus a text representation of the double value 120.47.
        //The net result is the same, String l has the right values, however, a new String got created and the old one got discarded.

        double d = 120.47d;
        l += d;

        System.out.println("String l+ = " + l);
    }

}
