import java.util.*;
public class A2Q2 {
    public static int Max(int[]arr , int n){
        if(n==1){
            return arr[0];
        }else{
            return (arr[n-1]<Max(arr,n-1)?Max(arr, n-1):arr[n-1]);
        }
    }
    public static int Min(int[] arr , int n ){
        if(n==1){
            return arr[0];
        }else{
            return (arr[n-1]>Min(arr, n-1)?Min(arr, n-1):arr[n-1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i< n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements are : ");
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
        System.out.println("The max element in the array is : "+ Max(arr, n));
        System.out.println("The min element in the array is : "+ Min(arr, n));
        sc.close();
    }
}
