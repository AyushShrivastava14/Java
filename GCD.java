import java.util.*;

public class GCD{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter two no.:-");
        int a=in.nextInt();
        int b=in.nextInt();
        int gcd=0;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD: "+gcd);
        in.close();
    }
}
