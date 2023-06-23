public class subarray {
    public static void SubArray(int Numbers[]) {
        for(int i=0;i<Numbers.length;i++){
            int start = i;
            for(int j=i;j<Numbers.length;j++) {
                int end = j;
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
