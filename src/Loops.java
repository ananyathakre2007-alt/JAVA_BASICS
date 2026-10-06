import java.util.Scanner;
public class Loops {
    public static void main() {


//      for(int i=1;i<11;i++){
//          System.out.println(i);
//      }

//        for(int i=1;i<21;i++){
//            if (i%2==0){
//                System.out.println(i);
//            }

//        for(int i=2;i<21;i+=2){
//            System.out.println(i);
//        }
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int mult = 1;
//        for(int i = 1;i<=10;i++){
//            mult=n*i;
//            System.out.println(n+"*"+i+"="+mult);

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int count = 0;
//        while (n!=0) {
//            n = n / 10;
//            count += 1;
//        }
//        System.out.println(count);

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i =0;i<=n;i++){
//            if ((i%3==0)&&(i%5==0)){
//                System.out.println(i);
//            }


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        while(n!=0){
//            if ((n%10)%2!=0){
//                sum+=(n%10);
//
//            }
//            n=n/10;
//        }
//        System.out.println(sum);

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int rev = 0;
//
//        while (n!=0){
//
//            rev=(rev*10)+(n%10);
//            n=n/10;
//        }
//        System.out.println(rev);

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = n;
//        int rev = 0;
//
//        while (n!=0){
//
//            rev=(rev*10)+(n%10);
//            n=n/10;
//        }
//        if (rev==a){
//            System.out.println("It is a Palindrome");
//        }else{
//            System.out.println("Not a Palindrome");
//        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int max = n%10;
//        while(n!=0){
//            if (n%10>max){
//                max=n%10;
//
//            }
//            n=n/10;
//        }
//        System.out.println(max);

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String Prime = "Prime";
//
//        if (n <= 1) {
//            Prime = "Not Prime";
//        } else {
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                if (n % i == 0) {
//                    Prime = "Not Prime";
//                    break;
//                }
//            }}
//            System.out.println("Number is " + " " + Prime + " " + "Number");
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i=1;i<=n;i++){
//            if (i==1){
//                continue;
//            }
//            else{
//                String P = "Prime";
//                for(int j=2;j<=Math.sqrt(i);j++){
//                    if (i%j==0){
//                        P="Not Prime";
//                        break;
//                    }
//                }
//                if(P.equals("Prime")){
//                  System.out.println(i);}
//            }
//        }


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int F=1;
//
//        for(int i=1;i<=n;i++){
//            F=F*i;
//        }
//        System.out.println(F);

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a=n;
//         int count= 0;
//         while (n!=0){
//
//             n=n/10;
//             count+=1;
//         }
//         n=a;
//         int sum=0;
//         while (n!=0){
//             sum=sum+(int)Math.pow(n%10,count);
//             n=n/10;
//         }
//         if(a==sum){
//             System.out.println("Armstrong number");
//         }
//         else{
//             System.out.println("not an armstrong number");
//         }

//           Scanner sc = new Scanner(System.in);
//           int n = sc.nextInt();
//
//           int max=-1;
//           int  s_max=-1;
//
//           while(n!=0){
//               if ((n%10)>max){
//                  s_max=max;
//                  max=n%10;
//               }
//               else if ((n%10)>s_max && (n%10)!=max){
//                   s_max=n%10;
//               }
//               n=n/10;
//           }
//            System.out.println(s_max);


//           Scanner sc = new Scanner(System.in);
//           int n = sc.nextInt();
//           int a=n;
//           int sum=0;
//
//           if (n<0){
//               System.out.println("Not a perfect number");
//           }
//           else {
//
//               for (int i = 1; i < n; i++) {
//                   if (n % i == 0) {
//                       sum = sum + i;
//                   }
//               }
//               if (sum == a) {
//                   System.out.println("perfect number");
//               } else {
//                   System.out.println("Not a Perfect number");
//               }
//           }


//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if (a<b){
//            for(int i=a;i>=1;i--){
//                if ( a%i==0 && b%i==0){
//                    System.out.println("HCF is "+ i);
//                    break;
//                }
//            }}
//
//        if (b<a){
//            for(int i=b;i>=1;i--){
//                if ( a%i==0 && b%i==0){
//                    System.out.println("HCF is "+ i);
//                    break;
//                    }
//                }
//            }


//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        boolean found = false;
//
//        for(int i=1;i<=10;i++){
//            for(int j=1;j<=10;j++){
//                if (a*i == b*j) {
//                    System.out.println("LCM is " + a * i);
//                    found=true;
//                    break;
//                }
//            }
//            if (found){
//                break;
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int max;
//        if (a>b){
//            max=a;
//        }
//        else{
//            max=b;
//        }
//
//        while(true){
//            if (max%a==0 && max%b==0){
//                System.out.println("LCM is "+ max);
//                break;
//            }
//            max++;
//        }


        Scanner sc = new Scanner(System.in);
        int count=0;
        int sum=0;
        int max=-1;
        int a;


        do {
            a = sc.nextInt();
            if(a!=0){
                count++;
                sum = sum + a;
                if (a > max) {
                max = a;}
            }
        }
        while(a!=0);
        System.out.println("sum "+sum+" count "+count+" max "+max);
    }

}




