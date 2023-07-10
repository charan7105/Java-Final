package BackTracking;

class subsetstring{
    public static void substring(String str, String ans, int i){
        //Base
        if(i==str.length()){
            //For Null
            if(ans.length() == 0)
            {
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;

        
        }

        
        //Recursion
        //Yes
        substring(str,ans+str.charAt(i),i+1);
        //No
        substring(str,ans,i+1);
    }
    public static void main(String[] args){
        String str = "abc";
        substring(str,"",0);
    }
}
