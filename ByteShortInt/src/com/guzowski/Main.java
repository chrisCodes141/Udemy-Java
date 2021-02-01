package com.guzowski;

public class Main {
    //int min = -2.147b max = 2.147b
    //can use _ as ,

    //LONG accepts INT and don't need casting as much as short and byte
    public static void main(String[] args) {

        //width of 32 (this # is 2^31)
        int IntMinV=-2147483648; // 1 less and itll error
        int IntMaxV=2_147_483_647; // 1 more and itll error (these #'s r literal (fixed) //A*B an expression

        //width of 8
        byte myByteMin = -128; //more efficient cuz less space allocated
        byte myByteMax = 127;

        //width of 16
        short myShortMin = -32768;
        short myShortMax = 32767;

        //width of 64 (this # is 2^63)
        long myLongMin = -9_223_372_036_854_775_808L; // put L > l to tell comp its a Long
        long myLongMax = 9_223_372_036_854_775_807L;

        //EXAMPLES
        byte myByteValue = 120; //<that 120 is a LITERAL
        //byte myNewByteValue = (myByteValue/2); //<that is an expression, my defualt java converts expresion to INT
        byte myNNewByteValue = (byte)(myByteValue/2); //casting to byte
        short myShortValue = 32767;
        short myNewShortV = (short)(myShortValue/2);//casting to short

        //Challenge
        byte b = 1;
        short s = 2;
        int i = 3;
        long ComputingAbove = 50000L+(b*10)+(s+i);//doesnt need L
        System.out.println(ComputingAbove);
    }
}
