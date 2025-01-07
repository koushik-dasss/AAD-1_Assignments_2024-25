// Write a JAVA program to find the missing number in an array.
import java.util.*;
public class A7Q3 {
    public static int MissingNumber(int [] arr){
        int n = arr.length;
        int sum1 = (n*(n+1)/2); // total sum of the elements of the array based on the size of the array
        int sum2 = 0 ; 
        for(int ele : arr){
            sum2+=ele; // sum of elements of the array
        }
        return sum1 - sum2;
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
        int result = MissingNumber(arr);
        System.out.println("The missing number is : "+ result);
        sc.close();
    }
}
