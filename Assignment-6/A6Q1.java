// Write a JAVA program to implement linear search without recursion.
import java.util.*;
public class A6Q1 {
    public static int LinearSearchIteration(int [] arr , int ele){
        int n = arr.length ;
        for(int i = 0 ; i< n ;i++){
            if(arr[i] == ele){
                return i;
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
        System.out.println("Enter the element to be found : ");
        int ele = sc.nextInt();
        System.out.println("The element "+ ele + " is found at  "+ LinearSearchIteration(arr, ele) + " position of the array");
        sc.close();
    }
}
