package com.guzowski;

public class Main {
//operators: =, ==, +, -, /, *, %, ++, --, +=, -=, *=, /=, !=, >=, <=, <, >
    //&& || ?:
    //instanceof
    //Bitwise and BitShift Operators -, <<, >>, >>>, &, ^, |
    //ctrl+alt+L reformats code nicely
    public static void main(String[] args) {
        int newValue = 50;
        if(newValue == 50)
            System.out.println("this is true");

        boolean isCar = false;
        if(isCar = true) // 1 equal sign working in if condition, because if expects boolean value returned
            System.out.println("this resolves because it still returns a T/F");

        boolean wasCar = isCar? true : false; //assigning value of wasCar depending on isCar T/F

        //Challenge

        double d = 20;
        double ndd = 80;
        double addedNmultipled = 25*(d+ndd);
        double usingRemainderOp = (addedNmultipled % 40);
        System.out.println(usingRemainderOp);
        if(usingRemainderOp <= 20)
            System.out.println("Total was over the limit");
   }
}
