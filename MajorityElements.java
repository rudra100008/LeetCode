public class MajorityElements {
    public  int majorityElements(int[] nums){
        int candidate = nums[0];
        int count=1;
        for (int i=1;i<nums.length;i++){
            if(nums[i] == candidate){
                count++;
            }else{
                count--;
                if(count == 0){
                    candidate = nums[i];
                    count = 1;
                }
            }
        }

        return candidate;
    }
    public static void main(String[] args){
        MajorityElements majorityElements = new MajorityElements();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int k = majorityElements.majorityElements(nums);
        System.out.println("Majority Elements: "+k);
    }
}
