public class Recursion {
    static void main() {
//        print(1);
//        System.out.println(Fibonacci(4));
        int[] arr = {1,2,4,3,1,4,2};
        System.out.println(binary(arr,3,0,arr.length-1));

    }

    static void print(int n) {
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }

    static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return (Fibonacci(n - 1) + Fibonacci(n - 2));
    }

    static int binary(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[m] > target) {
            return binary(arr, target, s,m+1);
        }
        return binary(arr, target, m-1, e);
    }
}

