//Array of Reference !!

import java.util.Scanner;

public class arraymethod {

    public static void arraychange(int marks[]) {
        for(int i=0; i<marks.length;i++)
        {
            marks[i]= marks[i]+2;
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];

        System.out.print("Enter Physics Marks:");
        marks[0] = sc.nextInt();
        System.out.print("Enter Chemistry Marks:");
        marks[1] = sc.nextInt();
        System.out.print("Enter Maths Marks:");
        marks[2] = sc.nextInt();

        arraychange(marks);

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
