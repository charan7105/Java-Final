import java.util.*;
public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age ra Pumka");
        int age = sc.nextInt();
        if (age<14) {
            System.out.println("Pora \nPilla Pumka");
        } else if (age>=14 && age<30) {
            System.out.println("Kastapadu Crct ga \nLekapote MG Aitav");
        }
        else{
            System.out.println("Musali na Mogga Pora Baytiki");
        }
    }
}
