package Arrays2D;
import java.util.*;

import java.util.Scanner;

public class arraycreation {

    public static void print(int numbers[][]){
        for(int i=0; i<numbers.length;i++){
            for(int j=0; j<numbers[0].length;j++){
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void create(int numbers[][]){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<numbers.length;i++){
            for(int j=0; j<numbers[0].length;j++){
                // System.out.print("Enter the Numbers");
                numbers[i][j] = sc.nextInt();
            }
        }
    }

    public static boolean Find(int numbers[][], int key){
        
        for(int i=0;i<numbers.length;i++){
            for(int j=0; j<numbers[0].length;j++){
                if(numbers[i][j] == key){
                    System.out.println("Yes we found this one");
                    return true;
                }
            }
        }
        System.out.println("No we dont found this one");
        return false;

    }
    public static void main(String[] args){
        int numbers[][] = new int[3][4];
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Key : ");
        int key = sc.nextInt();

        create(numbers);
        print(numbers);
        Find(numbers,key);
    }
}