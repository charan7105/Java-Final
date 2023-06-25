import java.util.Arrays;

public class pairs {

    public static void Pairs(int Numbers[]) {
        //Int Pettadam Marchipotunav
        for(int i=0;i<Numbers.length;i++){
            // int curr = Numbers[i]; 
            //i+1
            for(int j=i+1;j<Numbers.length;j++){
                System.out.print("("+Numbers[i]+","+Numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int Numbers[] = {22,13,44,32,42,54,23,12,35,45};
        // Arrays.sort(Numbers); As we havent done it in the binary search we wont use it.
        // if we print directly the array it wont get print thats why we are using .toString
        System.out.println(Arrays.toString(Numbers));
        Pairs(Numbers);
    }
}
