package Recursion;
import java.util.*;

public class Tables {

    public static void recusiontable(int number,int i ){
        if(i > 10){
            return;
        }else{
            //Main Method
            System.out.println(number*i); 
        }
        
        recusiontable(number,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int i = sc.nextInt();
        recusiontable(number,i);
    }
}