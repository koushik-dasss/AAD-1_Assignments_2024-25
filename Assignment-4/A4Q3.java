// Write a JAVA program to sort an array using bubble sort.
import java.util.Scanner;
public class A4Q3 {
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
        System.out.println("The sorted array elements are : ");
        for(int ele : bubbleSort(arr)){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
