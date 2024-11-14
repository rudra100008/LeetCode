import java.util.Arrays;

//Interview Question 4
public class RemoveElementsFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if(nums.length<2) return nums.length;

        int k = 1;
        int count = 0;
        for (int i=1;i<nums.length;i++){
            if (nums[i] != nums[i-1] ){
                count = 0;
            }else {
                count++;
            }
            if(count < 2){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        RemoveElementsFromSortedArrayII arrayII = new RemoveElementsFromSortedArrayII();
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int k = arrayII.removeDuplicates(nums);
        System.out.println("k: "+k);
        System.out.println("Array: "+ Arrays.toString(Arrays.copyOfRange(nums,0,k)));
    }
}
