package Recursion;

public class firstoccurance5 {

    public static int find(int arr[], int i, int key){
        //Base 
        if(i==arr.length){
            return -1;
        }
        //Method Execution
        if(arr[i]==key){
            return i;
        }
        //Recursion
        return find(arr,i+1,key);
    }
    public static void main(String[] args){
        int arr[] = {2,3,8,33,25,7,9,32,1,6,8,4,22,76,3,66,84,3,56};
        //Method Call
        System.out.println("First Occurence of given number is at: "+find(arr,0,4));
    }
}
