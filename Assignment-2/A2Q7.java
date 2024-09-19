// Qs. 7 :- Base to the power Exponent using Recursion
import java.util.Scanner;
public class A2Q7{
    public static int Pow(int x , int n){
        if(n==0){
            return 1 ;
        }else{
            return x*Pow(x,n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int x = sc.nextInt();
        System.out.println("Enter the power : ");
        int n = sc.nextInt();
        System.out.println(x+ " to the power "+ n + " is : "+ Pow(x, n) );
        sc.close();
    }
}
