// Write a JAVA program to find smallest possible missing number. (Example, Input array  A=[1,4,63,2,34], output=3)
import java.util.Scanner;
public class A2Q2 {
    public static int SmallestPositiveMissingNumber(int[] arr){
        int n = arr.length ;
        int value = 1 ; // smallest element of the array by default is considered here as 1 
        for(int i = 0 ; i<n ; i++){
            if(arr[i]==value){
                value++;
            }
        }
        return value;
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
        System.out.println("The smallest possible missing positive number is : "+SmallestPositiveMissingNumber(arr));
        sc.close();
    }
    
}
