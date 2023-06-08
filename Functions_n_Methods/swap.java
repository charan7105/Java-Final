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
        // System.out.println("a= "+a);
        // System.out.println("b= "+b);
    }
}
