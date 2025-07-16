package org.LeetCode.BinarySearch;
// Question no 33 Medium
public class SearchRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1 ;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target)return  mid;

            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right =  mid - 1;
                }
            }

        }
        return  -1;
    }
    public static void main(String[] args) {
        SearchRotatedSortedArray searchRotatedSortedArray = new SearchRotatedSortedArray();
        int[] arr = {3,1};
        int target =  1;
        int output = searchRotatedSortedArray.search(arr,target);
        if(output == -1){
            System.out.println("Element is not in array.");
        }else {
            System.out.println("Index of element[" + target + "]: " + output);
        }
    }
}
