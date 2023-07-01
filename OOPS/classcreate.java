package OOPS;

public class classcreate {
    public static void main(String[] args){
    // Inside the main method, we create an object of the class "pen" called "p1" using the "new" keyword. This object represents a pen in our program.
    pen p1 = new pen();
    p1.ChangeColor("Yellow");
    //This method is responsible for changing the color of the pen
    System.out.println(p1.Color);

    BankAccount acc1 = new BankAccount();

    acc1.UserName = "SaiCharan";
    acc1.SetPassWord("sdfsdf");
   }
}

class BankAccount{
    public String UserName;
    private String PassWord;
    
    public void SetPassWord(String NewPassWord){
        PassWord = NewPassWord;
    }
}
class pen{
//Pen Class it has its own properties
    String Color;
    int Pointer;

    // Pen class has two methods
    void ChangeColor(String NewColor){
        Color = NewColor;
    }

    void ChangePointer(int NewPointer){
        Pointer = NewPointer;
    }
}