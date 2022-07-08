package ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        //Integer is the key while String is value of key
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(0, "Hello");
        hashmap.put(1,"Chair");
        hashmap.put(2,"Chocolate");
        hashmap.put(3,"Goat");

        //We create Set Class object called keys
        Set<Integer> keys = hashmap.keySet();//this method gets all hash contained keys

        /*for (Integer key:keys){
            String valor =
        }

        System.out.println("2nd Value: "+hashmap.get(2));*/


    }

}
