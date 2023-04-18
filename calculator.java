import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First No");
        int first_no = sc.nextInt();
        System.out.println("Enter the Second No");
        int second_no = sc.nextInt();
        System.out.println("In which method you are going to be calculated ?\n1-Addition\n2-Substraction\n3-Multiplication\n4-Devision");
        int method = sc.nextInt();

        switch (method) {
            case 1:
            System.out.println(first_no+second_no);
            break;

            case 2:
            System.out.println(first_no-second_no);
            break;

            case 3:
            System.out.println(first_no*second_no);
            break;

            case 4:
            System.out.println(first_no / second_no);
            break;

            default:
            System.out.println("Enter Incorrect Input\nTry Again");
            break;
        }


    }
}
