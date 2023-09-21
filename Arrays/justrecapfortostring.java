import java.util.*;

public class justrecapfortostring {
    
    public static void askstring(String arr[]){
        for(int i=0;i<arr.length;i++){

            System.out.print("Enter your Name: ");
            
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextLine();
        }

        // printarr(arr);
    }

    // public static void printarr(String arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.println(arr[i]);
    //     }
    // }

    public static void main(String[] args){
        String arr[ ] = new String[5];
        askstring(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    
}
