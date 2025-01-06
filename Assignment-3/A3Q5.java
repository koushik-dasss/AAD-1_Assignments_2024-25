// Write a JAVA program to computing nth power of a number using RECURSION.
import java.util.Scanner;
public class A3Q5 {
    public static int power(int x , int n){
        if(n==0){
            return 1 ;
        }else{
            return x*power(x,n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int x = sc.nextInt();
        System.out.println("Enter the power : ");
        int n = sc.nextInt();
        System.out.println("The result is : "+power(x,n));
        sc.close();
    }
    
}
