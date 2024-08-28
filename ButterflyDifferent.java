import java.util.Scanner;

public class ButterflyDifferent {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter value: ");
        int n=in.nextInt();
        int k=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<(2*k);j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            k--;
        }
        k=0;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<(2*k);j++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
            k++;
        }
        in.close();
    }
}
