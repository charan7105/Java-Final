package Functions_n_Methods;
import java.util.*;

public class binomialcoeff {
    
    public static int factorial(int n) 
    {
        int f = 1;
        for(int i= 1; i<=n; i++ )
        {
            f = f*i;
        }
        // System.out.println(f);
        return f; 
    }

    // ----------------------------------------------

    public static int binocoeff(int n, int r) 
    {
        int n_fac = factorial(n);
        int r_fac = factorial(r);
        int nr_fac = factorial(n-r);

        int binarycoeffcient = n_fac / (r_fac*nr_fac);
        System.out.println("The Answer is = "+binarycoeffcient);
        return binarycoeffcient;
    }

    // ----------------------------------------------

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N Value");
        int n = sc.nextInt();
        System.out.println("Enter the R Value");
        int r = sc.nextInt();
        binocoeff(n, r);

    }
}