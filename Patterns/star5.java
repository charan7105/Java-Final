package Patterns;

import java.util.Scanner;

public class star5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many times you need to print the Star");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
    }
}
