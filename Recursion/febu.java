package Recursion;

public class febu {
    public static int feb(int n){
        if(n==1 || n==0){
            return n;
        }

        int fnm1 = feb(n-1);
        int fnm2 = feb(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }
    
    public static void main(String[] args){
        int n = 14;
        System.out.print(feb(23));
        // System.out.print(feb(56));
        // System.out.print(feb(57));
    }
}
