// Qs. 3 :- Factorial of a number using Recursion
import java.util.*;
public class A2Q3 {
    public static int Fact(int n ){
        if(n==0){
            return 1; 
        }else{
            return n*Fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The factorial of "+ n + " is : "+ Fact(n) );
        sc.close();
    }
}
