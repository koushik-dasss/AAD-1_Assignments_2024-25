// Brute Force Approach (Manual shifting)
import java.util.*;
public class A1Q3_1 {
    public static int[] rotateByK(int[] arr, int K) {
        int n = arr.length ;
        int[] temp = new int[K];
        for(int i = 0 ; i< K ; i++){ // Storing of first K elements  
           temp[i] = arr[i];
        }
        for(int i = K ; i< n ; i++){ // Shifting of rest of the elements of the array  to the front(beginning of array) 
           arr[i-K] = arr[i];
        }
        for(int i = 0 ; i<K ; i++){ // PLacing the first K elements to the end of the array
           arr[n-K+i] = temp[i];
        }
        return arr;
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
        System.out.println("Enter the Kth position : ");
        int K = sc.nextInt();
        rotateByK(arr, K);
        System.out.println("The modified array is : ");
        for(int ele : rotateByK(arr, K)){
            System.out.print(ele +" ");
        }
        sc.close();
    }
}
