// Write a JAVA program to find factorial of a number using RECURSION.
import java.util.*;
public class A3Q3{
    public static int Factorial(int n){
        if(n==0){
            return 1 ;
        }else{
            return n*Factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The factorial of "+ n + " is : "+ Factorial(n) );
        sc.close();
    }
}
