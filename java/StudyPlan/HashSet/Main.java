package StudyPlan.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // contains only unique keys
        HashSet<String> cars = new HashSet<>();

        cars.add("Ferrari");
        cars.add("Polo");
        cars.add("Volvo");
        cars.add("Polo");
        System.out.println("Only one Polo is stored (unique values)");
        System.out.println(cars);

        System.out.println("Check if an item exists using contains()");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the car name to search");
        String str = s.nextLine();
        if(cars.contains(str)){
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }
    }

    // remove(value), clear(), add(), size();

}
