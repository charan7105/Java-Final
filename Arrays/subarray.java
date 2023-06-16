public class subarray {
    public static void SubArray(int Numbers[]) {
        for(int i=0;i<Numbers.length;i++){
            int start = i;
            for(int j=i;j<Numbers.length;j++){
                int end = j;
                //K is equal to end because it need to print min of one array. 
                // Example => i=0; j=0; So now it will check to K
                // K=0 K=0 It accepts and it will print
                // Next it will increment to 1 then then it will fails so the loop stops, then it will again start from i.
                for(int k=start;k<=end;k++){
                    System.out.print(Numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int Numbers[] = {22,13,43,63,21,43,23,13,36};

        SubArray(Numbers);
    }
}
