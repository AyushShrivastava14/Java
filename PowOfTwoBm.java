public class PowOfTwoBm {
    public static void main(String[] args) {
        int n=6;
        int count=0;
        for(int i=0;i<16;i++){
            int bitmask=1<<i;

            if((bitmask & n)!=0){
                count++;
            }
        }
     
        if(count==1){
            System.out.println("Yes the no. is in the power of 2");
        }
        else{
            System.out.println("No");
        }
    }
}
