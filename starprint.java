import java.util.Scanner;

public class starprint 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter your n Value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++)  
        {
            for(int j=0; j<=i; j++)
            {   
                System.out.print("* ");
            }   
            System.out.println();   
        }
    }
}