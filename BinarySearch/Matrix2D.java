package org.LeetCode.BinarySearch;


// Question no 74 -> Medium  Search a 2D Matrix
public class Matrix2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int count  = 0;
        while (count < rows) {
            if( search(matrix[count], target)) {
                return true;
            }else {
                count++;
            }
        }
        return false;
    }

    private boolean search(int[] matrix,int target){
        int left = 0;
        int right = matrix.length - 1 ;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(matrix[mid] == target){
                return true;
            } else if (matrix[mid] <= target) {
                left = mid + 1;
            } else if (matrix[mid] >= target) {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Matrix2D matrix2D = new Matrix2D();
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        boolean output = matrix2D.searchMatrix(matrix,target);
        if(output){
            System.out.println("Element(" + target + ") is in 2D matrix ");
        }else {
            System.out.println("Element(" + target + ") is not in 2D matrix ");
        }
    }
}
