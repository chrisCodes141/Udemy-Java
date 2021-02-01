package com.guzowski;

public class Main {
    //float is SINGLE precision
    //Double is DOUBLE precision (twice as much detail as float) FASTER on most computers over float
    //java assumes decimal values as doubles
    public static void main(String[] args) {
	int myIntValue = 5; //if divided by 2, answer is 4 cuz !care bout remainder
	float myFloatValue = (float)5.4f/3;//proper practice enter a f at end || cast float
    double myDoubleValue = 5d/3;//proper practice enter a d at end (stored as 5.0)

//    System.out.println(myIntValue);
//    System.out.println(myFloatValue);
//    System.out.println(myDoubleValue);

    //challenge convert a given number of lb to kg (1 lb = 0.45359237 kg)
        double lb = 10d;
        double convertedKilograms = lb*.45359237;
        System.out.println("Your "+lb+" pounds converts to " + lb*.45359237/*||convertedKilograms*/ + " kg");

    }
}
