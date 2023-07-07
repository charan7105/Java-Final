package Recursion;

public class rmvduplicates {
    public static void rmvdupl(String str, int Index, StringBuilder newString, boolean Map[]){
        // Base
        if(Index == str.length())
        {
            System.out.println(newString);
        }
        // Method+// Recursion
        char CurrChar = str.charAt(Index);
        if(Map[CurrChar-'a'] == true) 
        {
            rmvdupl(str, Index+1, newString, Map);
        }        
        else
        {
            Map[CurrChar-'a'] = true;
            rmvdupl(str, Index+1, newString.append(CurrChar), Map);
        }
    }
    public static void main(String args[])
    {
        String input = "saicharan";
        StringBuilder newString = new StringBuilder();
        boolean[] map = new boolean[26];
        rmvdupl(input, 0, newString, map);
    }
}

