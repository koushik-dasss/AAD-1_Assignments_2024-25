// Qs. 1 :- Sum of n numbers (n-> User Input , integers -> user input)
// Sum Until n  
// Sum of distinct n numbers
import java.util.*;
public class A1Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum1 = 0 , sum2 = 0 ;
        for(int i = 1 ; i<= n ;i++){
            sum1+=i; // sum of numbers until n 
            int j = sc.nextInt();
            sum2+=j; // sum of n distinct numbers
        }
        System.out.println("The sum of numbers until "+ n + " is : "+ sum1);
        System.out.println("The sum of "+ n + " distinct numbers is : "+ sum2);
        sc.close();
    }
}