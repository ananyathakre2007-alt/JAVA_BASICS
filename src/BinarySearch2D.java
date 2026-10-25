import java.util.Arrays;
public class BinarySearch2D {

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 34;
        System.out.println(Arrays.toString(SearchInStrictly2DSorted(matrix,target)));
    }

    static int[] SearchIn2D(int[][] matrix,int target){
        int r=0;
        int c=matrix.length-1;

        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int []{r,c};
            }
            if(target>matrix[r][c]){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] SearchInStrictly2DSorted(int[][] mat,int target){
        int start=0;
        int n= mat[0].length;
        int end = mat.length * n;

        while(start<=end){

            int mid=start+(end-start)/2;

            int row=mid/n;
            int col=mid%n;

            if(mat[row][col]==target){
                return new int[] {row,col};
            }

            else if (mat[row][col]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
