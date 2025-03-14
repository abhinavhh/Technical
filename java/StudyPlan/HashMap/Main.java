package StudyPlan.HashMap;

import java.util.HashMap;
public class Main {
    public static void main(String[] args){

        // key value pairs are used and accessed.

        HashMap<String, Integer> person = new HashMap<>();

        person.put("Abhi", 06);
        person.put("Das", 05);

        System.out.println("HashMap after put is : ");
        // get is used to retrieve a value using key

        // keySet() returns key and values() returns values

        for(String i : person.keySet()){
            System.out.println("Key : "+i +" Value: "+person.get(i));
        }

        // remove(key) , size(), clear()
    }
}
