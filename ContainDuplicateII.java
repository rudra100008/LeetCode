import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainDuplicateII {
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        for(int i=0;i< nums.length;i++){
//            for (int j=i+1;j< nums.length;j++){
//                if(nums[i] == nums[j] && Math.abs(i-j)<=k){
//                    return true;
//                }else{
//
//                }
//            }
//        }
//        return false;
//    }
 public boolean containsNearbyDuplicate(int[] nums, int k) {
     HashMap<Integer,Integer> mapNumbers = new HashMap<>();
     for (int i=0;i<nums.length;i++){
         if(mapNumbers.containsKey(nums[i]) && i - mapNumbers.get(nums[i])<=k){
             return true;
         }
         mapNumbers.put(nums[i],i );
     }
    return false;
}
    public static void main(String[] args){
        ContainDuplicateII containDuplicateII = new ContainDuplicateII();
        int[] nums = {1,0,1,1};
        int k=1;
        boolean result =containDuplicateII.containsNearbyDuplicate(nums,k);
        System.out.println("Output: "+result);
    }
}
