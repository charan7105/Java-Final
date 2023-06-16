public class maxsumsubarray {
    public static void SubArraySum(int Numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<Numbers.length;i++){
            int start = i;
            for(int j=i;j<Numbers.length;j++){
                int end = j;
                currSum = 0;//To again refresh the currSum. 
                for(int k=start;k<=end;k++){
                    currSum += Numbers[k];
                    System.out.println("All the Possible arrays : "+ currSum);
                }
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum is : "+maxSum);
        
    }
    public static void main(String[] args) {
        int Numbers[] = {22,13,43,63,21,43,23,13,36};

        SubArraySum(Numbers);
    }
}