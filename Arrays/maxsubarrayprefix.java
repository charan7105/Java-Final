public class maxsubarrayprefix {

    public static void SubArray(int Numbers[]){
        int curr = 0;
        int MaxArr = Integer.MIN_VALUE;
        int Prefix[] = new int[Numbers.length];

        for(int i=0;i<Prefix.length;i++){
            //Calc Prefix Array
            Prefix[i] = Prefix[i-1] + Numbers[i];
        }

        for(int i=0; i <Numbers.length; i++){
            int start = i;
            for(int j=i; j<Numbers.length;j++){
                int end = j;
                curr = start == 0 ? Prefix[end]: Prefix[end] - Prefix[start-1];
                for(int k=start; k<=end; k++){
                    // System.out.print(Numbers[k]+" ");
                    curr += Numbers[k];
                }
                // System.out.println(MaxArr);
                if(curr>MaxArr){
                        MaxArr = curr;
                    }
            }
        }
        System.out.println(MaxArr);

    }
    public static void main(String[] args) {
        int Numbers[] = {1,21,-23,12,213,12,-21};

        SubArray(Numbers);
    }
}
