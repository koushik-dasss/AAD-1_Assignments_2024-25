// Brute Force Solution 
// Sorting the array and finding out the smallest positive missing number 
// TC :- O(n^2) because of Bubble Sort 
// TC :- O(n*logn) if Arrays.sort is used in place of Bubble Sort
// SC :- O(1) for functions operatiing in place  ,(apart from the input array which takes a space of O(n))
// Overall SC : O(n)
import java.util.*;
public class A1Q5_1 {
    public static int[] BubbleSort(int[] arr){
        for(int i = 0 ; i< arr.length - 1 ; i++){
            for(int j = 0 ; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static int SmallestPositiveMissingNumber(int [] sortedArray ){
        int missing = 1 ;
        for(int ele : sortedArray){
            if(ele==missing){
                missing++;
            }
        }
        return missing;
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
        System.out.println("The sorted array elements are : ");
        for(int ele : BubbleSort(arr)){
            System.out.print(ele+" ");
        }
        System.out.println();
        int [] sortedArray = BubbleSort(arr);
        System.out.println("The smallest positive missing number is : "+ SmallestPositiveMissingNumber(sortedArray));
        sc.close();
    }
}
