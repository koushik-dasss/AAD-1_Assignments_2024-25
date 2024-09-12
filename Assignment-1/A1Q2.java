import java.util.*;
public class A1Q2 {
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
        System.out.println("The max element of the array is : "+ max_ele(arr));
        System.out.println("The max element of the array is : "+ min_ele(arr));
        sc.close();
    }
    private static int max_ele(int[] arr){
            int max = arr[0];
            for(int i = 0 ; i< arr.length ; i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            return max;
    }
    private static int min_ele(int[] arr){
        int min = arr[0];
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
}
        
    
    
}

