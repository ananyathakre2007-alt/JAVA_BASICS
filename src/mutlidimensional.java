import java.util.Scanner;
import java.util.Arrays;
public class mutlidimensional {
    static void main() {


        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<arr.length;i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] r : arr) {
            for (int num : r) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}