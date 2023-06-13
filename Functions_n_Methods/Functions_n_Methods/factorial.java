package Functions_n_Methods;
import java.util.*;

public class factorial {
    
    public static int factorial(int n) 
    {
        int f = 1;
        for(int i= 1; i<=n; i++ )
        {
            f = f*i;
        }
        System.out.println(f);
        return f; 
    }
    public static void main(String[] args) 
    {
        // System.out.println(factorial(7));
        System.out.println("Enter the N Value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
    }
}
