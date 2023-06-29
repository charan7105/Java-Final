package strings;

import java.util.Scanner;

public class strings {

    public static void vidividiga(String name){
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Name: ");
    // String name = sc.next();
    String name = sc.nextLine();
    System.out.println("Welcome, "+name);
    vidividiga(name);
    }
}
