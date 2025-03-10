package StudyPlan.ListSorting;

import java.util.ArrayList;
import java.util.Collections;

public class DemoSort {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(3);
        num.add(5);
        num.add(6);
        num.add(10);
        num.add(2);
        Collections.sort(num);
        System.out.println("Sorted list is : ");
        for(Integer n: num){
            System.out.println(n);
        }

        System.out.println("Reverse sort list is : ");
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("Sorted list is : ");
        for(Integer n: num){
            System.out.println(n);
        }

    }
}
