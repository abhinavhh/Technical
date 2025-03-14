
public class MergeSortedArray{
    public void merge(int[] nums1, int m, int[] nums2, int n){

        int i = m - 1;
        int j = n - 1;
        int right = m + n - 1;

        while (j >= 0) {
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[right] = nums1[i];
                i--;
            }
            else{
                nums1[right] = nums2[j];
                j--;
            }
            right--;
        }
        // System.out.println(nums1);
        for (i = 0; i < nums1.length; i++) {
            System.out.printf("%d\t", nums1[i]);
        }
    }
    public static void main(String args[]){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,2,4};
        int n = 3;
        MergeSortedArray a = new MergeSortedArray();
        a.merge(nums1,m,nums2,n);
    }
} 