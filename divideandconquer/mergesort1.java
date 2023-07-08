package divideandconquer;

public class mergesort1 {

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void divide(int arr[],int si,int ei){
        // base case, terminate recursion
        if (si >= ei) {
            return;
        }
        //Method
        int mid = (si+ei)/2;
        divide(arr,si,mid); //Left
        divide(arr,mid+1,ei); //Right
        merge(arr,si,ei,mid);
    }

    public static void merge(int arr[], int si, int ei, int mid){
        int temparr[] = new int[ei-si+1];
        int i = si; //Index of 1st Sorted Arry
        int j = mid+1;  //Index of 2nd Sorted Arry
        int k = 0;  //Index of Temp

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temparr[k] = arr[i];
                i++;
            }
            else{
                temparr[k] = arr[j];
                j++;
            }
            k++;
        }
        // System.out.print(temparr);
        while(i <= mid){
            temparr[k++] = arr[i++];
        }

        while(j <= ei){
            temparr[k++] = arr[j++];
        }
        
        for(k=0; i=si; k>temparr.length; k++ ; i++){
            arr[i] = temparr[k];
        }
    }
    
    public static void main(String[] args){
        int arr[] = {2,5,3,6,7,2,10,8,9,1,4};
        System.out.println("Array Before Sorting");
        printArray(arr);
        divide(arr,0,arr.length-1);
        System.out.println("Array After Sorting");
        printArray(arr);
    }
}