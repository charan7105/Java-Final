import java.util.*;

public class sumofn {
    public static void main(String[] args)
    {
        System.out.print("Enter the Number:");
        int i=1;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(i<=n)
        {
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
