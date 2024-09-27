public class Main {
//Method overloading used for not having redunadant methods
    //why? impvroves readability and re-usability, easaier remmeber 1 name
    // u DONT want sum2Numbers, sum3Numbers, sum4Numbers
    // U want sum, sum, sum (different para)
    public static void main(String[] args) {
/*        calculateScore("Tim", 500);
        calculateScore(75);
        calculateScore();
*/
        double data;

        data = calcFeetAndInchesToCentimeters(1,12);
        System.out.println(data);
        data = calcFeetAndInchesToCentimeters(11);
        System.out.println(data);
    }
/*
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player name or score");
        return 0;
    }
*/
//    public static void calculateScore(){ having VOID WONT CHANGE SIGNATURE
//        System.out.println("No player name or score");
//        return 0;
//    }
    //challenge method called calcFeetAndInchesToCentimeters

    public static double calcFeetAndInchesToCentimeters(double ft, double in){
        if((ft >= 0) && (in >= 0 && in <= 12)){
            return(((ft*12)*2.54)+(in * 2.54));
        }
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double in){
        return calcFeetAndInchesToCentimeters(0, in);
    }
}
