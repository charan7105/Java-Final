package Patterns;
import java.util.*;

public class increasing_traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Stars of Triangle you want?");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


