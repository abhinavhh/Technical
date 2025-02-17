import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target, int n){
            Map<Integer, Integer> numMap = new HashMap<>();
            for(int i = 0; i < n; i++){
                int diff = target - nums[i];
                if(numMap.containsKey(diff)){
                    return new int[]{numMap.get(diff), i};
                }
                numMap.put(nums[i], i);
            }
            return new int[]{};
    
        }
        public static void main(String[] args){
        
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the array size: ");
            int n = s.nextInt(0);
            int[] nums = new int[n];
            for(int i = 0 ;i < n; i++){
                nums[i] = s.nextInt();
            }
            System.out.println("Enter the target value: ");
            int target = s.nextInt();
            System.out.println(twoSum(nums, target, n));
    }
}
