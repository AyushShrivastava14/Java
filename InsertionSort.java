import java.util.Scanner;

public class InsertionSort {
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

        //Sorting 
        for(int i=1;i<n;i++){
            int un_element=arr[i];
            int j=i-1;
            while(j>=0 && un_element < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=un_element;  // because j value is decremented one more time than the required place
        }

        // Printing sorted array
        System.out.print("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
