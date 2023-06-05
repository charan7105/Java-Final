import java.util.*;

public class mulofn {
    public static void main(String[] args)
    {
        System.out.print("Enter the Number:");
        int i=1;
        int mul=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(i<=n)
        {
            mul = mul*i;
            i++;
        }
        System.out.println(mul);
    }
}
