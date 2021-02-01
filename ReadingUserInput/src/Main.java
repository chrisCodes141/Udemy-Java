import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = sc.hasNextInt();

        if(hasNextInt){ // checks if wats entered is a number
            int yearOfBirth = sc.nextInt();
            sc.nextLine(); //handles the next line character (enter key) (without this line would skip the next line

            System.out.println("Enter your name: ");
            String name = sc.nextLine();

            sc.close();// save memory
            int age = 2019 - yearOfBirth;

            if(age >= 0 && age <= 100){
                System.out.println("Your name is: " + name + ", your age is " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
            sc.close();
        }
    }
}
