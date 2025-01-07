// Write a JAVA program to print duplicates in a list.
import java.util.*;
public class A7Q2 {
    public static ArrayList<Integer> PrintDuplicates(int [] arr , ArrayList<Integer> duplicates){
        int n = arr.length ;
        for(int i = 0 ; i< n ; i++){
            for(int j = i+1 ; j< n ; j++){
                if(arr[i] == arr[j]){
                    if(!duplicates.contains(arr[i])){ // if  array list doesn't contain the duplicate element previously 
                        duplicates.add(arr[i]);
                    }
                    break; // to avoid adding the same element multiple times 
                }
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList <Integer> duplicates = new ArrayList<>();
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are :");
        for(int i = 0 ; i<n ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The duplicates in the array are : ");
        for(int ele :  PrintDuplicates(arr, duplicates)){
            System.out.print(ele+" ");
        }
        System.out.println();
        sc.close();
    }
}
