// Write a JAVA program to generate nth fibonacci number using RECURSION.
import java.util.Scanner;
public class A3Q4{
    public static int Fibo(int n){
        if(n<=2){
            return n ;
        }else{
            return Fibo(n-1)+ Fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("The "+ n + " th Fibonacci Nnumber is : "+ Fibo(n));
        sc.close();
    }
}

