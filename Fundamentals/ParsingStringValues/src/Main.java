public class Main {
    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString= " + numberAsString);

        int number = Integer.parseInt(numberAsString);// need to put the datatype we are parsing into to call right parsing method
        System.out.println("number = "+number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString= " + numberAsString);
        System.out.println("number = "+number);

        String numberAsString2 = "2018.125";
        double number2 = Double.parseDouble(numberAsString2);
    }
}
