import java.util.Arrays;
import java.util.HashSet;

public class ContainDuplicate {
    // 217.Contains Duplicate
    //Given an integer array nums, return true if any value appears at least twice
    // in the array, and return false if every element is distinct.
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenNumber= new HashSet<>();
        for(int num :nums){
            if(seenNumber.contains(num)){
                return true;
            }
            seenNumber.add(num);
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,3};
        ContainDuplicate containDuplicate = new ContainDuplicate();
        boolean result = containDuplicate.containsDuplicate(nums);
        System.out.println("Output: "+result);
    }
}
