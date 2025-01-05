// Write a JAVA program to find factorial of a number using ITERATION. 
import java.util.*;
public class A2Q4 {
    public static int Factorial(int n){
        int fact = 1 ;
        for(int i = 1 ; i<= n ; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The factorial of "+ n + " is : "+ Factorial(n) );
        sc.close();
    }
}
