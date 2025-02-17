
class Solution{

    public static void removeDuplicates(int[] nums){
            int j = 0;
            if(nums.length == 0){
                System.out.println("null");
            }
            else{
                
                for(int i = 1 ; i < nums.length ; i++){
    
                    if(nums[i] != nums[j]){
                        j++;
                        nums[j] = nums[i];
                    }
                }
            }
            for(int i = 0 ; i < j + 1 ; i++){
                System.out.print(nums[i]);
            }
        }
        public static void main(String args[]){
    
            int nums[] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
            removeDuplicates(nums);

    }
}