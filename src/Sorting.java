import java.util.Scanner;
import java.util.Arrays;
public class Sorting {
    public static void main() {
        int[] arr={3,2,4,5,6};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void BubbleSort(int[] arr){
        int n=arr.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

    }
}
