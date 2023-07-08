import java.util.Scanner;
//Lab Problem
public class stringoddevendiff {
    public static void findDiff(String num) 
    {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < num.length(); i++) 
        {
            int digit = num.charAt(i);
            
            if (i % 2 == 0) 
            {
                even += digit; //Add Even
            } else 
            {
                odd += digit; //Add Odd
            }
        }
        int diff = even - odd;
        System.out.println("Even Sum: " + even);
        System.out.println("Odd Sum: " + odd);
        System.out.println("Difference: " + Math.abs(diff));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.nextLine();
        findDiff(num);
    }
}
