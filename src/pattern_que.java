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

//        for(int i = 0;i>=row-1;i++){
//            for(int j=1;j>=col-i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=col;i++){
//            for(int j=1;j<=col-i+1;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        int a=1;
//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=row-i+1;j++){
//                System.out.print(a+"  ");
//                a=a+1;
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=i;j++){
//                if((i-j)%2==0){
//                    System.out.print("1");
//                }else{
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=row;i++){
//            for (int j=1;j<=col-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=(row-i);j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            if(i!=1){
//                for(int a=1;a<=i-1;a++){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }


//        for(int i=1;i<=row;i++){
//            for(int j=1;j<i;j++){
//                System.out.print(" ");
//            }
//            for(int j=i;j<=row;j++){
//                System.out.print("*");
//            }
//            if(i!=row){
//                for(int j=1;j<=row-i;j++){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j=1;j<=(2*row-(2*i));j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int i=5;i<=2*row;i++){
            for(int j=row;j>=i;j--){
                System.out.print("*");
            }
            for(int j=1;j<=(2*row-(2*i));j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
