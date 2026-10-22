import java.util.Scanner;

import java.util.Arrays;

public class Array {
    public static void main() {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int len = sc.nextInt();

        int arr[]= new int[len];

        for(int i=0;i<len;i++){
            System.out.print("Enter element "+ i);
            arr[i]=sc.nextInt();
        }

//        for(int i=0;i<len;i++){
//            System.out.print(arr[i]+" ");
//        }
//        for(int num:arr){
//            System.out.print(num);
//        }

    }
}
