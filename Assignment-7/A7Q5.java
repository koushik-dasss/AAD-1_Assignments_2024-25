// Write a JAVA program to find the element which appears maximum number of times in an array.
import java.util.*;
public class A7Q5 {
    public static int MaximumAppearance(int [] arr){
        // int n = arr.length;

        return 1 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are :");
        for(int i = 0 ; i<n ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
    
}
