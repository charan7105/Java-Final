package Recursion;

public class recrusion1 {
    public static void decresingorder(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        decresingorder(n-1);
    }

    public static void main(String[] args){
        int n = 10;
        decresingorder(n);
    }
}
