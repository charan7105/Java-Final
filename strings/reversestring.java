package strings;

public class reversestring {
    public static void main(String[] args) {
        String str = "Hello";
        String reversestr = "";
        char ch;

        System.out.println("Original word: " + str);

        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            reversestr = reversestr + ch;
        }

        System.out.println("Reversed word: " + reversestr);
    }
}
