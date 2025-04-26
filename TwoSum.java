import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 1; i<nums.length; i++){
            for (int j =i; j< nums.length;j++) {
                if ((nums[j] + nums[j-i]) == target) {
                    return new int[]{j-i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum twosum = new TwoSum();
        int[] nums =  {2,5,5,11};
        int target = 10;
        int[] output =twosum.twoSum(nums,target);
        System.out.println(Arrays.toString(output));
    }
}
