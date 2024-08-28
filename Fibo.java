import java.util.Scanner;

public class Fibo {
    public static void main(String args[]){
        int a=0,b=1,c=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number of Elements:-");
        int n=in.nextInt();
        System.out.println("Fibonacci Series:-");
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=(n-2);i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        in.close();
    }
}
