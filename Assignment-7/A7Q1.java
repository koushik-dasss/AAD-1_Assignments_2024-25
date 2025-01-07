// Write a JAVA program to find the first repeated elements in an array.
import java.util.Scanner;
public class A7Q1 {
    public static int FirstRepeated(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i< n ; i++){
            for(int j = i+1 ; j< n ; j++){ // j = i+1 , look for further elements directly
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1; // No repeated element 
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
        int result = FirstRepeated(arr);
        if(result!=-1){
            System.out.println("The first repeated element is : "+result);
        }else{
            System.out.println("There is no repeated element in the array");
        }
        sc.close();
    }
}
