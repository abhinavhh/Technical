package StudyPlan.LinkedList;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args){

        LinkedList<String> cars = new LinkedList<String>();
        // use same functions as in the ArrayList add, remove, clear, get, set, size
        cars.add("Volvo");
        cars.add("Ferrari");
        cars.add("Alto");

        for(String car: cars){
            System.out.println(car);
        }

        cars.set(0, "BMW");
        System.out.println("After changing Volvo to BMW : ");
        for(String car: cars){
            System.out.println(car);
        }

        cars.remove("Alto");
        System.out.println("After removing alto : ");
        for(String car: cars){
            System.out.println(car);
        }
        System.out.println("Using get on 1 index : "+cars.get(1));
        System.out.println("Size is "+cars.size());

        // additinal functions of linked list getFirst, getLast, setFirst, setLast, addlast, addLast, removeFirst, removeLast
    }
}
