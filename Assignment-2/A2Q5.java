// Qs. 5 :-  GCD of two numbers using Recursion 
import java.util.Scanner;
public class A2Q5 {
    public static int GCD(int a , int b){
        if(b==0){
            return a ;
        }else{
            return GCD(b, a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt() , b = sc.nextInt();
        System.out.println("The GCD of "+ a + " and "+ b + " is : "+ GCD(a, b));
        sc.close();
    }
}
