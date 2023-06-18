import java.util.*;
public class ArrayTwice {
    public static void ArrayTwiceFind(int Numbers[]){
        for(int i=0;i<Numbers.length;i++){
            for(int j=i+1;j<Numbers.length;j++){
                if(Numbers[i] == Numbers[j]){
                    System.out.println("Yes");
                }else{System.out.println("No");}
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Numbers[] = new int[5];
        for(int i=0;i<Numbers.length;i++){
            System.out.print("Enter the Number at index:"+i+" => ");
            Numbers[i] = sc.nextInt();
        }
        // System.out.println(Numbers);
        // It wont get output it will generate the meemory address insted.
        ArrayTwiceFind(Numbers);
    }
}
