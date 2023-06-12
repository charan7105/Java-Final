package Functions_n_Methods;
import java.util.*;

public class prime {

    public static boolean prime(int n) {
        boolean itsprime = true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                itsprime = false;
            }
        }
        return itsprime;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number which you are going to check :");
        int n = sc.nextInt();
        System.out.println(prime(n));
    }
}
