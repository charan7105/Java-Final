package Recursion;

public class recursion2 {

    public static void Increasingorder(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        Increasingorder(n-1);
        System.out.print(n+" ");
        
    }

    public static void main(String[] args){
        int n = 10;
        Increasingorder(n);
    }
}


