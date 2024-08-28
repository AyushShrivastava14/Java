import java.util.Scanner;

public class FactorialRecursion {
    
    int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    
    public static void main(String[] args){
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:-");
        n = sc.nextInt();
        FactorialRecursion obj = new FactorialRecursion();
        n=obj.fact(n);
        System.out.println("Factorial: "+n);
        sc.close();
    }
}
