package Recursion;

public class checksortornot3 {
    
    public static boolean checking(int Arr[], int i){
        if(i==Arr.length-1){
            return true;
        }
        if(Arr[i]>Arr[i+1]){
            return false;
        }
        return checking(Arr, i+ 1);
    }
    
    public static void main(String[] args){
        int Arr[]= {2,4,5,6,10,23,144};
        System.out.println(checking(Arr,0));

    }
}
