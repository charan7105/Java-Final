import java.util.Scanner;

public class faclastno {

    public static void factorial(int n) {
        long fac = 1;
        for (int i = 2; i <= n; i++) {
            fac *= i;
        }

        while (fac % 10 == 0) {
            fac /= 10;
            // System.out.println(fac);
        }

        int lastDigit = (int)(Math.abs(fac) % 10);
        System.out.println(lastDigit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
    }
}
