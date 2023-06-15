import java.util.Arrays;

public class binarysearch {
    public static int binarySearch(int Numbers[], int key) {
        int start = 0; int end = Numbers.length-1;
        while(start <= end)
        {
            int mid = (start+end)/2;
            
            if(Numbers[mid] == key){
                return mid;
            }
            if(Numbers[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int Numbers[] = {1,2,6,52,62,12,44,23,53,92};
        Arrays.sort(Numbers); 
        //It will Sort the Array !! and make binary search possible.
        int key = 44;

        int binarySearchmain = binarySearch(Numbers,key);
        System.out.println(binarySearchmain);
    }
}
