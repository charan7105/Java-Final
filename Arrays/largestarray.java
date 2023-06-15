public class largestarray {
    public static int largeNumber(int Numbers[]) {
        int Highest_No = Integer.MIN_VALUE;

        for(int i=0;i<Numbers.length;i++){
            if(Numbers[i]>Highest_No){
                Highest_No = Numbers[i];
            }
        }
        return Highest_No;
    }
    
    public static void main(String[] args) {
        int Numbers[] = {1,2,6,52,62,12,44,23,53,92};

        int Highest_Number = largeNumber(Numbers);
        System.out.println("The Highest Number of Array is : "+Highest_Number);
    }
}
