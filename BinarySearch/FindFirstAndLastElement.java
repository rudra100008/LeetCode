package org.LeetCode.BinarySearch;

import java.util.Arrays;

// Question no 34 -> Medium
public class FindFirstAndLastElement {

    public int[] searchRange(int[] nums, int target) {
        int[] index = {-1,-1};
        index[0] = firstOccur(nums,target);
        index[1] = lastOccur(nums,target);
        return index;
    }

    private int firstOccur(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        int first = -1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                first = mid;
                right = mid - 1;
            } else if ( nums[mid] <= target) {
                left =  mid + 1;
            } else if (nums[mid] >= target) {
                right = mid - 1;
            }
        }
        return first;
    }

    private int lastOccur(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        int last = -1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                last = mid;
                left = mid + 1;
            } else if ( nums[mid] <= target) {
                left =  mid + 1;
            } else if (nums[mid] >= target) {
                right = mid - 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        FindFirstAndLastElement firstAndLastElement = new FindFirstAndLastElement();
        int[] arr = {5,7,7,8,8,8,10};
        int target = 8;
        int[] output = firstAndLastElement.searchRange(arr,target);
        if(Arrays.equals(output, new int[]{-1,-1})){
            System.out.println("Element is not in array.");
        }else {
            System.out.println("Index of element[" + target + "]: " + Arrays.toString(output));
        }
    }
}
