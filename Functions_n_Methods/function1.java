package Functions_n_Methods;
import java.util.Scanner;

public class function1 {
    public static int calculatesum(int num1, int num2) 
    {
        int sum = num1+num2;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a, b);
        System.out.println(sum);
    }
}
