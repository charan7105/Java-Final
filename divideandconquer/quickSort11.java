package divideandconquer;
import java.util.*;

public class quickSort11 {
    
    public static void QuickSort(int arr[],int si,int ei){
        //Base 
        if(si >= ei){
            return;
        }
        int Pindx = Partition(arr,si,ei); //The Pivot Element's Index after it got Arranged 
        QuickSort(arr,si,Pindx-1); //Left Side One
        QuickSort(arr,Pindx+1,ei); //Right Side One
    }

    public static int Partition(int arr[], int si, int ei){
        //Pivot Element
        int Pivot = arr[ei];
        int i=si-1; //i = -1

        for(int j=si; j<ei;j++){
            if(arr[j]<= Pivot){
                i++;
                //Swap The Non Pivot Elements
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //Swap the Pivot Element
        i++;
        int temp = Pivot;
        arr[ei] = arr[i];
        arr[i] = temp; //pivot = temp
        return i;
    }
    public static void main(String[] args){
        int arr[] = {2,3,9,8,2,5};
        QuickSort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}
