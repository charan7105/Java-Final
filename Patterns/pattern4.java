package Patterns;
import java.util.*;

public class pattern4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many Stars of Triangle you want?");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            for(int j=i;j<=n-1;j++)
            {
                System.out.print("  ");
                // Enduko emo 
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}
