package sorting;

public class selectionsort {

    public static void sort(int numbers[]){
        for(int i = 0; i < numbers.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[j] < numbers[minIndex]){
                    minIndex = j;
                }
            }
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
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
