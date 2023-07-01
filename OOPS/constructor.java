package OOPS;

public class constructor {
    public static void main(String[] args){
        Pen p1 = new Pen("Orange");
        System.out.println(p1.Color);
    }
}

class Pen{
    int pointer;
    String Color;

    Pen(String Color){
        this.Color = Color;
    }
}
