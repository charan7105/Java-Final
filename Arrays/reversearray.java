import java.util.Arrays;

public class reversearray {
    public static void ReverseArray(int Numbers[]) {
        int start = 0;
        int last = Numbers.length-1;
        //This is where i made error

        while(start<last){
            int temp = Numbers[start];
            Numbers[start] = Numbers[last];
            Numbers[last] = temp;

            start++;
            last--;
        }
    }
    public static void main(String[] args){
        int Numbers[] = {1,2,6,52,62,12,44,23,53,92};
        // Arrays.sort(Numbers);

        ReverseArray(Numbers);

        for(int i=0;i<Numbers.length;i++){
            System.out.print(Numbers[i]+" ");
        }
        System.out.println(" ");
    }
}
