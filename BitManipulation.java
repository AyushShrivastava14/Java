public class BitManipulation {
    public static void main(String[] args) {

        // Get bit 

        // int n=5;
        // int pos=3;
        // int bitmask=1<<pos;
        
        // if((bitmask & n)==0){
        //     System.out.println("Bit was zero");
        // }
        // else{
        //     System.out.println("Bit was one");
        // }


        //Set bit (it sets the bit to one)

        // int n=5;
        // int pos=3;
        // int bitmask=1<<pos;

        // int result=bitmask | n;
        // System.out.println(result);


        // Clear bit (it set the target bit to zero)

        int n=5;
        int pos=2;
        int bitmask=1<<pos;

        int notbitmask= ~bitmask;
        int result= notbitmask & n;
        System.out.println(result);

        
        /* Update bit (In this if we need to set the target bit to 1 we use set bit operation and if we need to set the 
        targt bit to 0 then we use clear bit opeation, means its a combination of 2 methods i.e. Set and Clear method)*/
    }
    
}
