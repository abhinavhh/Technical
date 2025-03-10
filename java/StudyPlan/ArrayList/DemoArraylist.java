package StudyPlan.ArrayList;
import java.util.ArrayList;
public class DemoArraylist {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();

        // insert element using add()
        cars.add("Volvo");
        cars.add("Ferrari");

        // loop to print
        System.out.println("After using add function : ");
        for(String car: cars){
            System.out.println(car);
        }

        // remove an element using remove()
        cars.remove("Ferrari");
        System.out.println("After using remove function for ferrari: ");
        for(String car: cars){
            System.out.println(car);
        }

        // update using set() method

        cars.set(0, "Alto");

        System.out.println("After using set function for Volvo to Alto: ");
        for(String car: cars){
            System.out.println(car);
        }

        // Note : we can also specify index on every functions eg- cars.add(0,"Volvo")
        
        //find length using size() function

        int len = cars.size();
        System.out.println("Length of array now is : "+len);


        // retrieve an element using get function

        System.out.println("Retrieved element is : "+ cars.get(0));

        // clear() function to remove all elements
        cars.clear();
        len = cars.size();
        System.out.println("Size after using clear is : "+len);
    }
}
