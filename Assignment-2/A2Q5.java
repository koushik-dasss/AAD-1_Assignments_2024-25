// Write a JAVA program to generate nth fibonacci number using ITERATION. 
import java.util.Scanner;
public class A2Q5 {
    public static int Fibo(int n){
        int a = 0 , b = 1 , sum = 0  ;
        for(int i = 0 ; i < n ; i++){
            sum = a +  b;
            a = b ;
            b = sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("The "+ n + " th Fibonacci Nnumber is : "+ Fibo(n));
        sc.close();
    }
}
