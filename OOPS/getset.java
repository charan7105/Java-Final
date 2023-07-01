package OOPS;

public class getset {
    public static void main(String[] args){
        pen pen1 = new pen();
        pen1.setColor("Yellow");
        System.out.println(pen1.getColor());
    }
}

class pen{
    private int Pointer;
    private String Color;

    int getPointer(){
        return this.Pointer;
    }

    String getColor(){
        return this.Color;
    }

    void setPointer(int Pointer){
        this.Pointer = Pointer;
    }
    void setColor(String Color){
        this.Color = Color;
    }
}
