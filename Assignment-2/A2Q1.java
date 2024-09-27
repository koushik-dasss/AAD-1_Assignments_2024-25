import java.util.Scanner;
public class A2Q1 {
    public static int Sum_of_n_Array(int [] arr , int n){
        if(n==1){
            return arr[0];
        }else{
            return  arr[n-1] + Sum_of_n_Array(arr, n-1);
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
        System.out.println("The sum of "+ n + " elements in the array is : "+ Sum_of_n_Array(arr, n));
        sc.close();
    }
}

