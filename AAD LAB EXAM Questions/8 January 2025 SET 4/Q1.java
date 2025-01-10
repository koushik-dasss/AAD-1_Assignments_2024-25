import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N(Number of items in each store):");
        int N = sc.nextInt();
        System.out.println("Enter the value of X(Freshness Value):");
        int X = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int total_value = 0;
        System.out.println("Enter the freshness values : ");
        for(int i = 0 ; i< N ; i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the costs : ");
        for(int i = 0 ; i< N ;i++){
            B[i] = sc.nextInt();
        }
        for(int i = 0 ; i< N ; i++){
            if(A[i]>=X){
                total_value+=B[i];
            }
        }
        System.out.println("Total value is : "+ total_value);
        sc.close();
    }
}
