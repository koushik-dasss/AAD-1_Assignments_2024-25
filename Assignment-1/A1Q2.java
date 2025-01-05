// Write a JAVA program to find maximum and minimum elements in an array.
import java.util.*;
public class A1Q2 {
    public static int max(int[] arr){
        int max = arr[0];
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr){
        int min = arr[0];
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
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
        System.out.println("The max element in the array is : "+ max(arr));
        System.out.println("The min element in the array is : "+ min(arr));
        sc.close();
    }
}