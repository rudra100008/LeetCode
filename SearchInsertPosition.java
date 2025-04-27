public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
       int left  = 0;
       int right = nums.length-1;
       while(left <= right){
           int mid = left + (right -left)/2;
           if(nums[mid] == target){
               return mid;
           }else if(nums[mid]<target){
               left = mid+1; // in binary tree this search in left side
           }else{
               right = mid-1; // this search in right side
           }
       }
       return left;
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1,3,5,6,8};
        int target = 9;
        int output = searchInsertPosition.searchInsert(nums,target);
        System.out.println("Output: "+output);

    }
}
