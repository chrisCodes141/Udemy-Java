public class Main {
    //switch is good if testing 1 variable, testing multiple
    public static void main(String[] args) {
        int switchValue = 3;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:case 3:case 4: //COOOOOL STUFF!!!!!!!!
                System.out.println("Value was 2 / 3 /4");
                System.out.println("actually it was " + switchValue);
                break; // IF NO BREAK, will CONTINUE until hits break
            default:
                System.out.println("Was not 1 or 2");
                break;
        }
        //challenge

        char theChar = 'C'; //need '' NOT ""

        switch(theChar){
            case 'A':
                System.out.println("Its a");
                break;

            case 'B':
                System.out.println("Its a");
                break;

            case 'C':
                System.out.println("Its a");
                break;
            default:
                System.out.println("None of them");
        }

        String month = "JANUARY";

        switch(month.toLowerCase()){
            case "january":
                System.out.println("It's january");
                break;
        }
    }
}
