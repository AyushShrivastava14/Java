public class PowerOfNumberRecursion {
    
    static int powerOfNumber(int x, int n){
        if(n==0){
            return 1;
        }
        return x*powerOfNumber(x, n-1);
    }

    public static void main(String[] args) {
        int x=2, n=3;
        System.out.println(powerOfNumber(x,n));
    }
}
