import java.util.Scanner;
import java.util.Arrays;
public class Sorting {
    public static void main() {
        int[] arr={-1,-2,-3,0,7,8,5,3,2};
        BubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int last=arr.length-i-1;
            int max=GetMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }

    static int GetMaxIndex(int[] arr,int start,int last){
        int max=start;
        for (int i = start; i <= last ; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void BubbleSort(int[] arr){
        int n=arr.length;
        int temp;
        for(int i=0;i<n;i++){
            boolean swap=false;
            for(int j=1;j<n-i;j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }

    }
}
