public class Recursion {
    static void main() {
//        print(1);
//        System.out.println(Fibonacci(4));
        int[] arr = {1,2,4,3,1,4,2};
//        System.out.println(binary(arr,3,0,arr.length-1));
//        System.out.println(sumofdigits(12345,0));
//        System.out.println(sumofn(0,7));
//        System.out.println(prodofdigits(1,1234));
//        System.out.println(reverseofnum(0,12345));
//        System.out.println(ReverseofString("abcd",0));
        System.out.println(numofzero(10110000));

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

    static int sumofdigits(int n,int s){
        if(n==0){
            return s;
        }
        s=s+n%10;
        return sumofdigits(n/10,s);
    }


    static int sumofn(int a,int n){
        if(n==a){
            return a;
        }
        return a+sumofn(a+1,n);

    }

    static int prodofdigits(int p,int n){
        if(n==0){
            return p;
        }
       p=p*(n%10);
       return prodofdigits(p,n/10);
    }

    static int reverseofnum(int s,int n){
        if(n==0){
            return s;
        }
        s=(s*10)+(n%10);
        return reverseofnum(s,n/10);
    }

    static String ReverseofString(String s ,int i){
        if(i==s.length()-1){
            return String.valueOf(s.charAt(i));
        }
        return ReverseofString(s,i+1)+(String.valueOf(s.charAt(i)));

    }

    static boolean IsPalindrome(String p,int s,int e){
        if(s>e){
            return true;
        }
        if(p.charAt(s)!=p.charAt(e)){
            return false;
        }
        return IsPalindrome(p,s+1,e-1);
    }

    static int numofzero(int n){
        if(n==0){
            return 0;
        }
        int c = (n%10)==0?1:0;
        return numofzero(n/10)+c;
    }
}

