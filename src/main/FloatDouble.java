package main;

public class FloatDouble {

    //Floating Point Numbers have fractional parts that we express with a decimal point.
    //Example: 3.14159
    //Floating Point Numbers are also known as real numbers. We use a floating point number when we need more precision in calculations.

    //The float is a single precision number.
    //The double is a double precision number.

    //Precision refers to the format and amount of space occupied by the type.
    //Single precision occupies 32 bits (width of 32) (4 bytes).
    //Double precision occupies 64 bits (width of 64) (8 bytes).

    //Using double is faster than float because modern computers deal with doubles faster
    //java.Math functions are often written to process doubles and not floats
    //Java treats double as the default floating point number

    //In general, float and double are great for general floating point operations. But both are not great to use where precise calculations are required. This is due to a limitation with how floating point numbers are stored, and not a Java problem.
    //Java has a class called BigDecimal that overcomes this. When precise calculations are necessary, such as when performing currency calculations, floating point types should not be used.
    //For general calculations float and double are fine.

    public static void main(String[] args) {

        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;

        System.out.println("Float Max = " + maxFloat);
        System.out.println("Float Min = " + minFloat);

        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;

        System.out.println("Double Max = " + maxDouble);
        System.out.println("Double Min = " + minDouble);

        int intValue = 5 / 2;
        float floatValue = 5F / 2F;
        double doubleValue = 5D / 2D;

        System.out.println("intValue = " + intValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);

        int iVal = 5 / 3;
        float fVal = 5f / 3f;
        double dVal = 5d / 3d;

        System.out.println("iVal = " + iVal);
        System.out.println("fVal = " + fVal);
        System.out.println("dVal = " + dVal);

        double pounds = 200d;
        double kilos = (pounds * 0.45359237);

        System.out.println("Pounds = " + pounds);
        System.out.println("Kilos = " + kilos);

        double pi = 3.1415927d;
        double d = 3_456_789.4_567_890d;

        System.out.println("pi = " + pi);
        System.out.println("underscores = " + d);

    }

}
