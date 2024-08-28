import java.util.Scanner;

public class MethodProblems{

    // Problem-1 Method
    // int table(int a, int b){
    //     return a*b;
    // }

    // Problem-2 Method
    // void pattern(int a){
    //     for(int i=1;i<=a;i++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    // Problem-3 Method
    // int sumOfNumbers(int a){
    //     if(a==1){
    //         return 1;
    //     }
    //     a += sumOfNumbers(a-1);
    //     return a;
    // }

    // Problem-2 Method
    void pattern2(int a){
        for(int i=a;i>=1;i--){
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Problem-1
        // int n=0;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter no:-");
        // n=sc.nextInt();
        // System.out.println("\nTable:-");
        // MethodProblems obj = new MethodProblems();
        // for(int i=1;i<=10;i++){
        //     System.out.println(n+" x "+i+" = "+obj.table(n,i));
        // }
        // sc.close();

        // Problem-2
        // int n=0;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter no:-");
        // n=sc.nextInt();
        // MethodProblems obj = new MethodProblems();
        // System.out.println("\nPattern:-");
        // for(int i=1;i<=n;i++){
        //     obj.pattern(i);
        // }
        // sc.close();

        // Problem-3
        // int n=0;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter limit:-");
        // n=sc.nextInt();
        // MethodProblems obj = new MethodProblems();
        // System.out.println("Sum of "+n+" natural no. is: "+obj.sumOfNumbers(n));
        // sc.close();

        // Problem-4
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:-");
        n=sc.nextInt();
        MethodProblems obj = new MethodProblems();
        System.out.println("\nPattern:-");
        for(int i=n;i>=1;i--){
            obj.pattern2(i);
        }
        sc.close();
    }
}