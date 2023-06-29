package strings;

public class substirng {

    public static void subs(String word){
        int n = word.length();
        for(int i=0;i<n;i++){
            String new_subs = "";
            for(int j=i;j<n;j++){
                new_subs += word.charAt(j);
                System.out.print(new_subs +"\n");
            }
        }
    }
    public static void main(String[] args){
        String word = "CharanHere";
        subs(word);
    }
}
