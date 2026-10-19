class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int high = 0;
        int low = matrix.length-1;
        while(high<=low){
            int mid = high + (low-high)/2;
            if(matrix[mid][0]<target && matrix[mid][matrix[mid].length-1]>target) break;
            else if(matrix[mid][0]>target) low = mid-1;
            else high = mid+1;
        }

        int row = (high+low)/2;
        int left = 0;
        int right = matrix[row].length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(matrix[row][mid]==target) return true;
            else if(matrix[row][mid]>target) right = mid-1;
            else left = mid+1;
        }
        return false;
    }
}