package com.guzowski;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {//scope is accessibility of variables, this block is a scope
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        int savedFinalScore = finalScore; // ERROR because finalScore DELETED in if statement
        /*if(condition){
        if statement {block}
        } else {
            else statement {block}
        }
    */
    }
}
