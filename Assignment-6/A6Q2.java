// Write a JAVA program to implement linear search using recursion.
import java.util.*;
public class A6Q2 {
    public static int LinearSearchRecursion(int[] arr , int ele, int index){
       if(index > arr.length){ // index > arr.length means element is not found in the array
        return -1;
       }else if(arr[index]==ele){
        return index;
       }
        return LinearSearchRecursion(arr, ele, index+1);
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
        int index = 0 ;
        int result = LinearSearchRecursion(arr , ele , index);
        if(result!=-1){
            System.out.println("The element is"+ ele+ " found at index : "+result);
        }else{
            System.out.println("The element is not found in the array");
        }
        sc.close();
    }
}
