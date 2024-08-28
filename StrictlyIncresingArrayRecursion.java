public class StrictlyIncresingArrayRecursion {

    static void checkorder(int[] a, int index){
        if(index==a.length-1){
            System.out.print("Yes");
            return;
        }
        else if(a[index] < a[index+1]){
            checkorder(a, index+1);
        }
        else{
            System.out.print("No");
            return;
        }
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        checkorder(arr, 0);
    }
}
