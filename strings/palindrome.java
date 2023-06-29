package strings;

import java.util.Scanner;

public class palindrome {

    public static void palindromeCheck(String name) {
        int n = name.length();
        boolean isPalindrome = true;

        for (int i = 0; i < n / 2; i++) {
            if (name.charAt(i) != name.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Yes, " + name + " is a palindrome.");
        } else {
            System.out.println("No, " + name + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String name = sc.next();
        palindromeCheck(name);
    }
}
