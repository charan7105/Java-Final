package Functions_n_Methods;

public class swap {
    public static void swapno(int a, int b) 
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 5;
        swapno(a,b);

    }
}

package Functions_n_Methods;
import java.util.*;

public class swap2 {
    public static void swap(int a, int b) {
        int swap = a;
        a = b;
        b = swap;
        System.out.println("Now the values of a is:"+a);
        System.out.println("Now the values of b is:"+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
        // System.out.println("a= "+a);
        // System.out.println("b= "+b);
    }
}

