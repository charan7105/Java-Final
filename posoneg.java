import java.util.*;
import java.util.Scanner;

public class posoneg
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Numberuuu");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Yoo Mama Positive Numberuu");
        }
        else if(n==0){
            System.out.println("Yoo Mama Sunnaaaa Numberuu");
        }
        else{
            System.out.println("Yoo Mama Negative Numberuu");
        }
    }
}