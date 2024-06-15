public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int top = 0;
        int bottom = matrix.length - 1;
        while(top <= bottom){
            int mid = top + (bottom - top)/2;
            if((matrix[mid][0] <= target) && (matrix[mid][matrix[0].length - 1] >= target)){
                row = mid;
                break;
            }
            if(matrix[mid][0] > target){
                bottom = mid - 1;
            }else{
                top = mid + 1;
            }
        }
        if(row == -1) return false;

        int left = 0;
        int right = matrix[0].length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(matrix[row][mid] == target){
                return true;
            }
            if(matrix[row][mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;
    }
    
}
