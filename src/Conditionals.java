import java.sql.SQLOutput;
import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a>10){
//            System.out.println("Greater than 10");
//        }else{
//            System.out.println("Smaller than 10");
//        }
//        System.out.println("Enter any number");
//        int a =  sc.nextInt();
//        if (a>0){
//            System.out.println("Positive");}
//        else if(a<0){
//            System.out.println("negative");}
//        else{
//            System.out.println("Zero");
//        }


//        System.out.println("Enter any number");
//        int a = sc.nextInt();
//        if (a%2==0){
//            if(a>0){
//                System.out.println("Even-positive");}
//            else if(a<0){
//                System.out.println("Even-Negative");}
//            else{
//                System.out.println("zero");}
//        }
//        else{
//            if(a>0){
//                System.out.println("Odd-positive");}
//            else if(a<0){
//                System.out.println("Odd-Negative");}
//        }

//        System.out.println("Enter a");
//        int a = sc.nextInt();
//        System.out.println("Enter a");
//        int b = sc.nextInt();
//        System.out.println("Enter a");
//        int c = sc.nextInt();
//
//        if(a>=b & a>=c){
//            System.out.println(a);}
//        else if(b>=a & b>=c){
//            System.out.println(b);}
//        else{
//            System.out.println(c);}

//        System.out.print("enter year - ");
//        int year = sc.nextInt();
//
//        if (year % 400 == 0 || (year % 4 ==0 && year%  100!=0)){
//            System.out.println("Leap year");}
//        else{
//            System.out.println("not a leap year");

//        System.out.print("Enter angle 1 : ");
//        float a = sc.nextFloat();
//        System.out.print("Enter angle 1 : ");
//        float b = sc.nextFloat();
//        System.out.print("Enter angle 1 : ");
//        float c = sc.nextFloat();
//
//        if (a>0 && b>0 && c>0 && a+b+c == 180) {
//            if (a == 90 || c == 90 || b == 90 ) {
//                System.out.println("Right angle triangle");
//            } else if (a == b && b == c) {
//                System.out.println("Equilateral Triable");
//            } else if (a < 90 && b < 90 && c < 90) {
//                System.out.println("Acute Triangle");
//            } else {
//                System.out.println("Obtuse Triangle");
//            }
//        }
//        else{
//            System.out.println("Invalid angles");
//        }

//        String a = "ananya";
//        String b = "pass123";
//        System.out.println("enter username");
//        String Username = sc.nextLine();
//        System.out.println("enter password");
//        String Password = sc.nextLine();
//
//        if (Username.equals(a)){
//            if (Password.equals(b)){
//                System.out.println("Login successfull");}
//            else{
//                System.out.println("Invalid Password");}
//            }
//        else{
//            System.out.println("User not Found");

// -------------------------------------SWITCH--------------------------------------
//
//          System.out.println("enter number 1 : ");
//          float num1=sc.nextFloat();
//          System.out.println("enter operator : ");
//          char op = sc.next().charAt(0);
//          System.out.println("Enter number 2 : ");
//          float num2 = sc.nextFloat();
//
//          switch (op){
//
//              case '+':
//                  System.out.println(num1+num2);
//                  break;
//
//              case '-':
//                  System.out.println(num1-num2);
//                  break;
//
//              case '*':
//                  System.out.println(num1*num2);
//                  break;
//
//              case '/':
//                  if(num2 == 0){
//                      System.out.println("Cannot devide ...Warning : Devision by zero error");
//                  }
//                  else{
//                  System.out.println(num1/num2);}
//                  break;
//
//              case '%':
//                  if(num2 == 0){
//                      System.out.println("Cannot devide ...Warning : Devision by zero error");
//                  }
//                  else{
//                  System.out.println(num1%num2);}
//                  break;
//
//              default:
//                  System.out.println("Invalid Operator");
//        }

//        System.out.print("Enter Day : ");
//        String Day = sc.nextLine();
//
//        switch (Day){
//
//            case "Monday":
//                System.out.println("1");
//                break;
//
//            case "Tuesday":
//                System.out.println("2");
//                break;
//
//            case "Wednesday":
//                System.out.println("3");
//                break;
//
//            case "Thursday":
//                System.out.println("4");
//                break;
//
//            case "Friday":
//                System.out.println("4");
//                break;
//
//            case "saturday":
//                System.out.println("6");
//                break;
//
//            case "Sunday":
//                System.out.println("7");
//                break;
//
//            default:
//                System.out.println("Invalid day");
//        }

//        System.out.print("enter month number : ");
//        int num = sc.nextInt();
//
//        switch (num){
//
//            case 1:
//                System.out.println("January - 31");
//                break;
//
//            case 2:
//                System.out.println("February - 28");
//                break;
//
//            case 3:
//                System.out.println("March - 31");
//                break;
//
//            case 4:
//                System.out.println("April - 30");
//                break;
//
//            case 5:
//                System.out.println("May - 31");
//                break;
//
//            case 6:
//                System.out.println("June - 30");
//                break;
//
//            case 7:
//                System.out.println("July - 31");
//                break;
//
//            case 8:
//                System.out.println("August - 31");
//                break;
//
//            case 9:
//                System.out.println("September - 30");
//                break;
//
//            case 10:
//                System.out.println("October - 31");
//                break;
//
//            case 11:
//                System.out.println("November - 30");
//                break;
//
//            case 12:
//                System.out.println("December- 31");
//                break;
//
//            default:
//                System.out.println("invalid Month");
//                break;
//
//        }
//
//        int Sub1 = sc.nextInt();
//        int Sub2 = sc.nextInt();
//        int Sub3 = sc.nextInt();
//
//        int percentage = (Sub1+Sub2+Sub3)/3;
//
//        if (percentage<40){
//            System.out.println("Fail");}
//
//        else {
//            System.out.println("-------Enter Your Choice-------");
//            System.out.println("1 - Percentage");
//            System.out.println("2 - Grade");
//            System.out.println("3 - Pass/Fail");
//
//            int ch = sc.nextInt();
//
//            switch (ch) {
//
//                case 1:
//                    System.out.println("Percentage : " + percentage);
//                    break;
//
//                case 2:
//                    if (percentage > 90) {
//                        System.out.println("A");
//                    } else if (percentage > 80) {
//                        System.out.println("B");
//                    } else if (percentage > 70) {
//                        System.out.println("C");
//                    } else {
//                        System.out.println("D");
//                    }
//                    break;
//
//                case 3:
//                    System.out.println("Pass");
//                    break;
//            }
        }



    }
}
