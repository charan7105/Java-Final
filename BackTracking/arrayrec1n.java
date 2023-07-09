package BackTracking;
import java.util.*;

public class arrayrec1n {
    public static void arrayChange(int arr[], int i, int Value){
        //Base
        if(i==arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        //Method
        arr[i] = Value;
        //Function Call        
        arrayChange(arr,i+1,Value+1); //Incrementing {1,2,3,4,5} 
        arr[i] = arr[i]-2; //Backtracking
    }
    public static void main(String[] args){
        int arr[] = new int[5]; //Eymty Array with length 5
        arrayChange(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
}
