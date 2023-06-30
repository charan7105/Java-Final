package strings;

public class stringbuilder {
    public static void main(String[] args){
    StringBuilder alpha = new StringBuilder("");
    for(char ch = 'a';ch<='z';ch++){
        alpha.append(ch);
    }
    System.out.print(alpha);
    }
}

// Time Comp O(26)

