import java.util.Arrays;

public class RemoveElementsFromSortedArray {
//    public int removeDuplicate(int[] nums) {
//        int k=1;
//        for (int i=1; i<nums.length;i++) {
//            if (nums[i] != nums[i - 1]) {
//                nums[k] = nums[i];
//                k++;
//            }
//        }
//       return k;
//    }

    public int removeDuplicate(int[] nums) {
        if (nums.length < 2) return nums.length;

        int k = 1; // Start from 1 since the first element is always unique
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args){
        RemoveElementsFromSortedArray removeElements = new RemoveElementsFromSortedArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
       int k = removeElements.removeDuplicate(nums);
        System.out.println("k: "+k);
        System.out.println("Array:"+Arrays.toString(Arrays.copyOfRange(nums,0,k)));
    }
}
