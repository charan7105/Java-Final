package Recursion;

public class lastoccurence6 {

    public static int findlast(int arr, int i, int key){
        //Base
        if(i >= 0){
            return -1;
        }
        //Method
        if(arr[i]==key){
            return i;
        }
        //Reccurion
        return findlast(arr,i-1,key);
    }
    public static void main(String[] args){
        int arr[] = {12,34,523,1,5,5231,15,67,23,12,2,6,3,1,6,8,64,34};
        System.out.println(arr,arr.length-1,5);
    }
}
