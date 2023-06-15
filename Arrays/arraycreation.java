import java.util.Scanner;

public class arraycreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array Creation
        int marks[] = new int[5];

        //Enter the Input to the Array
        System.out.print("Enter Physics Marks:");
        marks[0] = sc.nextInt();
        System.out.print("Enter Chemistry Marks:");
        marks[1] = sc.nextInt();
        System.out.print("Enter Maths Marks:");
        marks[2] = sc.nextInt();

        // System.out.println("Your Maths Marks are before update : "+marks[2]);

        // float percentageb = (marks[0]+marks[1]+marks[2])/3;
        // System.out.println("Your Percentage is before update: "+percentageb+"%");

        //Array Update
        marks[2] = marks[2]+2;

        //Print of Array
        System.out.println("Your Physics Marks are : "+marks[0]);
        System.out.println("Your Chemistry Marks are : "+marks[1]);
        System.out.println("Your Maths Marks are : "+marks[2]);

        float percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Your Percentage is : "+percentage+"%");
    }
}
