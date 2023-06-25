package sorting;

public class insertionsort {

    public static void sort(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            int curr = numbers[i];
            int prev = i-1;

            while(prev>=0 && numbers[prev]>curr){
                numbers[prev+1] = numbers[prev];
                prev--;
            }
            numbers[prev+1] = curr;
        }
    }

    public static void print(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int numbers[] = {3, 2, 5, 6, 1, 4};
        sort(numbers);
        print(numbers);
    }
}


