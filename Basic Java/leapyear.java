import java.util.*;

public class leapyear {
    public static void main(String[] args)
    {
        System.out.println("Enter the Year Vro");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean x = (year%4) == 0;
        boolean y = (year%100) != 0;
        boolean z = (year%400) == 0;

        if(x && (y||z)){
            System.out.println("Its a Leap Year");
        }
        else{
            System.out.println("Its Not a Leap Year");
        }
    }
}
