import java.util.*;
public class A1Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int k = 1 ;
        for(int i = 1 ; i<=n ; i++){
            k*=i;
        }
        System.out.println("The factorial of "+ n +" is : "+ k);
        sc.close();
    }
    
}
