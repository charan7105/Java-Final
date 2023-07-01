package OOPS;

//⚡⚡⚡⚡⚡ Method OverRiding ⚡⚡⚡⚡⚡

public class methodoveriding {
    public static void main(String[] args){
        Deer d = new Deer();
        d.food();
        //Returns - Eat like an Deer
    }
}

class Animal{
    void food(){
        System.out.print("Eat like an Animal");
    }
}

class Deer{
    void food(){
        System.out.print("Eat like an Deer");
    }
}
