import java.util.Scanner;
public class LinearSearch {
    public static void search(int arr[], int x, int n)
    {
        int count = 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i] == x){
                count++;
                System.out.println("Element is present at index " +i);
            }
        }
        if(count==0)
            System.out.print("Element is not present in the array.");
    }

    public static void main(String args[])
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the array elements : ");
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        System.out.print("Enter the element to be searched : ");
        int x = scan.nextInt();
        search(arr, x, n);
    }
}
