package Arrays2D;
import java.util.Scanner;

public class arraycreation {

    public static void print(int numbers[][]){
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[0].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void create(int numbers[][]){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[0].length; j++){
                System.out.print("Enter a number: ");
                numbers[i][j] = sc.nextInt();
            }
        }
    }

    public static int Find(int numbers[][], int key){
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[0].length; j++){
                if(numbers[i][j] == key){
                    System.out.println("Yes, we found this key at position [" + i + "][" + j + "]");
                    return key;
                }
            }
        }
        System.out.println("No, we didn't find this key");
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        int numbers[][] = new int[rows][columns];

        System.out.print("Enter the Key to search for: ");
        int key = sc.nextInt();

        create(numbers);
        print(numbers);
        int result = Find(numbers, key);
        System.out.println("Result: " + result);
    }
}
