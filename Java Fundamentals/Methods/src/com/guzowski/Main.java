package com.guzowski;

public class Main {
    //cannot put a method within another method
    //void means nothing don't return anything
    //void method can be known as a procedure (method returning type void)

    // -1 conventionally means error, in searching algorithms invalid value or not found
    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//        int highScore = calculateScore2(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was "+highScore);
//        /* OR
//        calculateScore(true, 800, 5, 100);
//         */
//        int result = calculateScore2(false, score, levelCompleted, bonus);
//        System.out.println(result);

        //Challenge

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Chris", highScorePosition);
        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Ebu", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Michal", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Donald", highScorePosition);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
    public static int calculateScore2( boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        //have to send back a return even if is not true
        return -1;
    }
    //challenge
    public static void displayHighScorePosition(String playersName, int Position){
        System.out.println(playersName + " managed to get into position "+
                Position + " on the highscore table");
    }
    public static int calculateHighScorePosition(int playerscore){
        //multiple returns
        if(playerscore>=1000){
            //position = 1;
            return 1;
        }
        else if(playerscore >= 500){
            //position = 2;
            return 2;
        }
        else if(playerscore >= 100){
            //position = 3;
            return 3;
        }
        else{
            //position = 4;
            return 4;
        }
        //you can delete the else and return 4 bcuz compiler wont get if other return trigered

        //put the following code right after the
    }
}

