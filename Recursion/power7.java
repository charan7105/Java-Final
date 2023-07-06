package Recursion;
import java.util.*;

public class power7 {
    public static int findpower(int base, int power){
        //Base
        if(power==0){
            return 1;
        }
        //Main Method & //Recursion
        return base* findpower(base,power-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Base Number: ");
        int base = sc.nextInt();
        System.out.print("Enter your Power Value: ");
        int power = sc.nextInt();
        System.out.println("Your Answer is: "+findpower(base,power));
    }
}
