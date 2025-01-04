// Write a JAVA program to find sum of n numbers.
import java.util.*;
public class A1Q1 {
    public static  int sum(int[] arr){
        int sum = 0 ;
        for(int i = 0 ; i< arr.length ; i++){
            sum+=arr[i];
        }
        return sum;
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
        System.out.println("The sum of elements are : "+ sum(arr));
        sc.close();
    }
}
