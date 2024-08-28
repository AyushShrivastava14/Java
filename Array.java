import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // To find length of array we use array.length function
        /*int []arr= {10,20,30,40,50};
        System.out.println("Length: "+arr.length);*/

        // Problem-1

        /*float []arr = new float[5];
        System.out.println("Enter elements:-");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextFloat();
        }
        System.out.println("Elements:-\n");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }*/

        
        //Problem-2

        /*int []arr = new int[5];
        System.out.println("Enter no. of elements:-");
        int n=sc.nextInt();
        System.out.println("Enter elements:-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter no. to find:-");
        int count=0, element=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==element){
                count++;
            }
        }
        if(count!=0){
            System.out.println("Element is Present");
        }
        else{
            System.out.println("Element is not Present");
        }*/

        //Problem-3 (for-each loop)

        /*float []arr = new float[5];
        System.out.println("Enter no. of elements:-");
        int n=sc.nextInt();
        float a=0.0f;
        System.out.println("Enter marks:-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextFloat();
        }
        for(float element:arr){
            a+=element;
        }
        System.out.println("Sum is: "+(a/3.0f));*/

        //Problem-4

        /*int [][]arr1 = new int[2][3];
        int [][]arr2 = new int[2][3];
        System.out.println("Enter elements of 1st matrix:-");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of 2nd matrix:-");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sum of given matrices are:-");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]+=arr2[i][j];
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }*/

        //Problem-5

        /*int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }*/

        // Prints the range of integer 
        /*System.out.println(Integer.MIN_VALUE);        
        System.out.println(Integer.MAX_VALUE);*/        

        //Problem-6

        /*int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);*/
        
        //Problem-7

        boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }

        sc.close();
    }
}