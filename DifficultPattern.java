public class DifficultPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i = 0; i < 2*n-1; i++) {
            for(int j = 0; j < 2*n-1; j++) {
                int top = i;
                int left = j;
                int right = (2*n - 2) - i;
                int bottom = (2*n - 2) - j;

                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
        // for(int i=n;i>1;i--){
        //     int k=n+1;
        //     for(int j=n;j>=1;j--){
        //         if(k==i){
        //             System.out.print(i+" ");
        //         }
        //         else{
        //             System.out.print(j+" ");
        //             k--;
        //         }
        //     }
        //     for(int j=1;j<=(n-1);j++){
        //         if(i<=j){
        //             System.out.print((j+1)+" ");
        //         }
        //         else{
        //             System.out.print(i+" ");
        //         }
        //     }
        //     System.out.println();
        // }
        

        // for(int i=1;i<=n;i++){
        //     int k=n+1;
        //     for(int j=n;j>=1;j--){
        //         if(k==i){
        //             System.out.print(i+" ");
        //         }
        //         else{
        //             System.out.print(j+" ");
        //             k--;
        //         }
        //     }
        //     for(int j=1;j<=(n-1);j++){
        //         if(i<=j){
        //             System.out.print((j+1)+" ");
        //         }
        //         else{
        //             System.out.print(i+" ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
