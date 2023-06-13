package Patterns;

import java.util.Scanner;

public class starssquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Stars of Square you want?");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
