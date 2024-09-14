// Brute Force Solution (Maximum Sub Array Problem)
// Checking every possible subarray
// TC :- O(n^2)
import java.util.*;
public class A1Q4_1 {
    public static int MaximumSubArray(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            int currSum = 0 ; 
            for(int j = i ; j < arr.length ; j++){
                currSum+=arr[j];
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i<n ;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("Maximum subarray sum is : "+ MaximumSubArray(arr));
        sc.close();
    }
}
