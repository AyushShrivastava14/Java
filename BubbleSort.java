import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;
        System.out.println("Enter no. of elements:-");
        n= sc.nextInt();
        int []arr= new int[n];
        System.out.println("\nEnter elements of array:-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // Time complexcity: O(n^2)
        // Sorting
        int temp=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if( arr[j] > arr[j+1] ){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        // Printing sorted array
        System.out.print("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
