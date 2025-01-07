// Write a JAVA program to implement binary search without recursion.
import java.util.Scanner;
public class A6Q3 {
    public static int [] bubbleSort(int [] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j< n-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static int BinarySearchIteration(int[] arr , int low , int high , int ele){
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==ele){
                return mid;
            }else if(arr[mid]<ele){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
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
        System.out.println("The sorted array elements are : ");
        int [] sortedArray = bubbleSort(arr);
        for(int ele :  sortedArray){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("Enter the element to be found : ");
        int ele = sc.nextInt();
        int low = 0 , high = arr.length - 1;
        int result = BinarySearchIteration(arr , low , high , ele);
        if(result!=-1){
            System.out.println("The element is"+ ele+ " found at index : "+result);
        }else{
            System.out.println("The element is not found in the array");
        }
        sc.close();
    }
}
