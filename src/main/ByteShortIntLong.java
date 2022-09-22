package main;

public class ByteShortIntLong {

    //A Package is a way to organize your Java projects. You can consider them as folders with sub-folders.

    //Java uses the concept of a Wrapper Class for all eight Primitive Data Types.
    //In the case of an int, we can use Integer, and by doing that it gives us ways to perform operations on an int.

    //A byte occupies 8 bits. We say that a Byte has a width of 8.
    //A short occupies 16 bits. Has a width of 16.
    //An int occupies 32 bits. Has a width of 32.

    public static void main(String[] args) {

        int value = 10000;

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        System.out.println("Max Integer value = " + maxInt);
        System.out.println("Min Integer value = " + minInt);

        System.out.println("Busted Max value = " + (maxInt + 1)); //This is called an overflow. We tried to put too large a number into the space allocated by the computer for an Integer. The computer tried to fit it in, but by doing so it overflowed.
        System.out.println("Busted Min value = " + (minInt - 1)); //This is called an underflow.

        int maxIntTest = 2_147_483_647;

        System.out.println(maxIntTest);

        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;

        System.out.println("Byte Max = " + maxByte);
        System.out.println("Byte Min = " + minByte);

        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;

        System.out.println("Short Max = " + maxShort);
        System.out.println("Short Min = " + minShort);

        long longValue = 2_147_483_647_234L;

        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;

        System.out.println("Long Max = " + maxLong);
        System.out.println("Long Min = " + minLong);

        int total = (minInt / 2);

        //Casting means to treat or convert a number from one type to another.
        //Example: byte byteTotal = (byte) (minByte / 2);

        byte byteTotal = (byte) (minByte / 2);

        short shortTotal = (short) (minShort / 2);

        byte b = 2;
        short s = 4816;
        int i = 3264128;
        long l = (50000 + (10 * (b + s + i)));

        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);

    }

}
