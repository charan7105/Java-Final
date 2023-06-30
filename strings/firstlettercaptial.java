package strings;

public class firstlettercaptial {

    public static String Change(String Line){
        StringBuilder ChangedLine = new StringBuilder("");
        char ch = Character.toUpperCase(Line.charAt(0));
        ChangedLine.append(Line);
        for(int i=1;i<Line.length();i++){
            if(Line.charAt(i) == ' ' && i<Line.length()-1){
                ChangedLine.append(Line.charAt(i));
                i++;
                ChangedLine.append(Character.toUpperCase(Line.charAt(i)));
            }else{
                ChangedLine.append(Line.charAt(i));
            }
        }
        return ChangedLine.toString();
    }

    public static void main(String[] args){
        String Line = "charan is a president of CSI chapter vITAP";
        System.out.println(Change(Line)); 
    }
}