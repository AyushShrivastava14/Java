public class NoOfOneBm {
    public static void main(String[] args) {
        int n=7;
        int count=0;
        for(int i=0;i<16;i++){
            int bitmask=1<<i;

            if((bitmask & n)!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
