public class Butterfly{
    public static void main(String args[]){
        int n=4,i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            
            int spaces=2*(n-i);
            for(j=1;j<=spaces;j++){
                System.out.print("  ");
            }

            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            
            int spaces=2*(n-i);
            for(j=1;j<=spaces;j++){
                System.out.print("  ");
            }

            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }  
}