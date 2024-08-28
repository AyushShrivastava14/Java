import java.util.Scanner;

public class FibonacciRecursion {

    int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of terms:-");
        n = sc.nextInt();
        FibonacciRecursion obj = new FibonacciRecursion();
        for (int i = 0; i < n; i++) {
            System.out.print(obj.fibo(i) + " ");
        }
        sc.close();
    }

    /* Method-2
    public static void printFactorial(int a, int b, int n) {
        if(n == 0) {
           return;
        }
        System.out.println(a);
        printFactorial(b, a+b, n-1);
    }

    public static void main(String args[]) {
       printFactorial(0, 1, 5);
    }
    */
}
