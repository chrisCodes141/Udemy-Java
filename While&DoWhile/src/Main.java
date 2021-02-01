public class Main {
    public static void main(String[] args) {
//        int count = 1;
//        while(true){
//            if(count == 6){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }


//        int count = 6;
//        do{
//            System.out.println("Count value was " + count);
//            if(count > 15){
//                break;
//            }
//            count++;
//        }while(count != 20);

        int number = 4;
        int finishNumber = 20;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue; //by passes iteraton
            }
            System.out.println("Even number " + number);
        }
    }
    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }
        return false;
    }
}
