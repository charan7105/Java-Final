package Recursion;

public class binarystring {
    public static void stringgen(String str, int n, int lastplace) 
    {
        if (n == 0) 
        {
            System.out.println(str);
            return;
        }

        if (lastplace == 0) 
        {
            stringgen(str+'0', n-1,0);
            stringgen(str + '1', n - 1, 1);
        } else 
        {
            stringgen(str + '0', n - 1, 0);
        }
    }

    public static void main(String[] args) 
    {
        stringgen("", 3, 0);
    }
}

