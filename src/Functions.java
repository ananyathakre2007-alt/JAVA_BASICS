import java.util.Scanner;

public class Functions {
    public static void main() {

//       sum();
//       greet();
//        suum();
//        System.out.println(suum());
//        System.out.println(sum(10,20));
        swap(10, 20);


    }

    static void sum() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }

    static void greet() {
        System.out.println("Hello world!!");
    }

    //return type
    static int suum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a + b;

    }

    //Arguments and parameters

    static int sum(int a, int b) {
        return a + b;
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + "b = " + b);

    }

}

