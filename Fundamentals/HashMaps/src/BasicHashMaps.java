import java.util.HashMap;
import java.util.Map;

public class BasicHashMaps {
    //creates a hashmap for key of String and value of boolean
    static HashMap<String, Boolean> map = new HashMap<>();
    public static void main(String[] args) {
        //adding ppl
        map.put("Chris", true);
        map.put("Ebu", false);

        //to get value
        System.out.println(map.get("Chris"));// returns the value

        //to check if key exists
        if(map.containsKey("Idontexist")){
            System.out.println("It does exist");
        }
        //to check if this particular hasmpa contains a value
        if(map.containsValue(Boolean.FALSE)){
            System.out.println("It contained the boolean valuse of false");
        }
        //loop thru all keys
        for(String s : map.keySet()){
            System.out.println("Looping by keySet");
        }
        //loop thru all values
        for(Boolean b : map.values()){
            System.out.println("Looping by values");
        }
        //looping thru as if it was an arrayList and returning all as a single entry
        for(Map.Entry kv : map.entrySet()){
            System.out.println(kv);
        }
        //to remove from has map
        map.remove("Chris");
    }
}
