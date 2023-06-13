package Functions_n_Methods;
import java.util.Scanner;

public class mul {
    
    public static int mul(int a,int b) 
    {
        int mult = a*b;
        return mult;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int mult = mul(n1, n2);
        System.out.println(mult);
    }
}
