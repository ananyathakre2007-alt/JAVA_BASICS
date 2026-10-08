import java.util.Scanner;
public class pattern_que {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of columns : ");
        int col = sc.nextInt();
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=col;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=col;j++){
//                if(i==1 | i==row | j==1 | j==col){
//                    System.out.print("*"+" ");
//                }else{
//                    System.out.print("  ");}
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=row;i++){
//            for(int j=col;j>=i;j--){
//                System.out.print("*"+" ");
//
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=row;i++){
//                System.out.print("  ".repeat(row-i));
//                System.out.print("* ".repeat(i));
//                System.out.println();
//            }
//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=row-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        for(int i = 0;i>=row-1;i++){
            for(int j=1;j>=col-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }



    }
}
