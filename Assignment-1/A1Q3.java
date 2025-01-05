// Write a JAVA program to rotate an array by k positions.
import java.util.*;
public class A1Q3 {
    public static int[] RotateArrayByK_BruteForce(int[] arr , int k ){
        int n = arr.length;
        k = k%n ;  // k>n case is handled here 
        for(int i = 0 ; i<k ; i++){
            int temp = arr[0];
            for(int j = 0 ; j< n-1 ; j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;
        }
        return arr;
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
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();
        int[] rotatedArray = RotateArrayByK_BruteForce(arr , k);
        for(int num : rotatedArray){
            System.out.print(num+" ");
        }
        System.out.println();
        sc.close(); 
    }
}
