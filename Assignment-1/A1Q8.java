import java.util.*;
public class A1Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0 , b = 1 , sum = 0 ; 
        System.out.println("Enter the limit value : ");
        int n = sc.nextInt();
        for(int i = 0 ; i< n ; i++){
            sum = a + b ;
            a = b  ;
            b = sum;
        }
        System.out.println("The "+ n +" th fibonacci number is : "+ sum );
        sc.close();
    }
    
}
