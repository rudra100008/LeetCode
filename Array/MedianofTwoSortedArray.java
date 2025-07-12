package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianofTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;

        int nums3[] = new int[a+b];
        System.arraycopy(nums1,0,nums3, 0,nums1.length);
        System.arraycopy(nums2,0,nums3,nums1.length,nums2.length);
        Arrays.sort(nums3);
        System.out.println("Merge array: "+ Arrays.toString(nums3));

        int len = nums3.length;


        if (len % 2 == 0) {
            return (double)(nums3[len/2 - 1] + nums3[len/2]) / 2;
        } else {
            return (double) nums3[len/2];
        }

    }

    public static void main(String[] args) {
        MedianofTwoSortedArray median = new MedianofTwoSortedArray();
        int[] nums1 = {1,3} ;
        int[] nums2 = {2};
        double result = median.findMedianSortedArrays(nums1,nums2);

        System.out.println("Result: " + result);
    }
}
//        if(len % 2 == 0){
//            System.out.println("Even");
//            int firstIndex = len/2;
//            int secondIndex = firstIndex-1;
//            System.out.println("FirstIndex: "+ firstIndex + "\nSecondIndex: "+ secondIndex);
//            return (double) (nums3[firstIndex] + nums3[secondIndex])/2;
//        }else{
//            System.out.println("Odd");
//            int firstIndex = len/2;
//            System.out.println("FirstIndex: " + firstIndex);
//            return (double) (nums3[firstIndex]);
//        }