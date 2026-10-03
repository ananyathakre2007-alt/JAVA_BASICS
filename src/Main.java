import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("What is your name");
//        String name = sc.next();
//        System.out.print(name);

       //Take the user's name as input and print:
//        System.out.println("Enter user name : ");
//        String name = sc.next();
//        System.out.println("Hello" +" " +  name);

        //Take two integers as input and print their sum.
//        System.out.println("Enter integer a : ");
//        int a = sc.nextInt();
//        System.out.println("Enter integer b : ");
//        int b = sc.nextInt();
//        System.out.println("Sum is = " + (a+b));

        //Take a character as input and print its ASCII/Unicode integer value.
//        System.out.println("Enter a character : ");
//        char a = sc.next().charAt(0);
//        int b = a;
//        System.out.println((int)a);
//
//        int a = 10;
//        double b = a;
//
//        System.out.println(a);
//        System.out.println(b);

        //Write a program that takes a double from the user and converts it into:
        //
        //int
        //float
        //long
        //
        //Print all three values.

        System.out.println("Enter a number");
        double a = sc.nextDouble();
        int b = (int)a;
        float c = (float)a;
        long d = (long)a;
        System.out.println("int : "+b+" "+"float : "+c+" "+"long : "+d);



    }
}