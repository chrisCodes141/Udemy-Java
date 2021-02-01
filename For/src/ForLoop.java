public class ForLoop {

    public static void main(String[] args) {
        for(int i = 0; i < 9; i++){
            System.out.println("Loop " + i);
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));//#f represents # of decimal places
            //7 would return 700.000000000001, uncomment string format to fix
        }
    }
    public static double calculateInterest(double amount, double interest){
        return(amount * (interest/100));
    }
}
