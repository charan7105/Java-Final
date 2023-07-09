package divideandconquer;

public class rotatedarray{
    public static int findIndex(int arr[],int si,int ei,int target)
    {
        //Base
        if(si>ei){
            return -1;
        }
        //Mid 
        int mid = (si+ei)/2;

        //Mid as Target 
        if(arr[mid] == target){
            return mid;
        }

        //CASE1 
        if(arr[si]<=arr[mid]){
            //Case a
            if(arr[si]<=target && target<= arr[mid]){
                return findIndex(arr,si,mid-1,target);
            }
            //Case b
            else{
                return findIndex(arr,mid+1,ei,target);
            }
        }
        //CASE2
        if(arr[mid]<=arr[ei]){
            //Case C
            if(arr[mid]<=target && target<=ei){
                return findIndex(arr,mid+1,ei,target);
            }
            //Case D
            else{
                return findIndex(arr,si,mid-1,target);
            }
        }
        return mid;
    }
    public static void main(String[] args){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 5;

        int tarIndex = findIndex(arr,0,arr.length-1,target);
        System.out.println(tarIndex);
    }
}