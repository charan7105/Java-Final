package OOPS;

public class interface1 {
    public static void main(String[] args){
        Queen q1 = new Queen();
        q1.moves();
    }
}

interface chess{
    void moves();
}

class Queen implements chess{
    public void moves(){
        System.out.println("Right, Left, Down, Up, Diagonal");
    }
}

class Rook implements chess{
    public void moves(){
        System.out.println("Right, Left, Down, Up");
    }
}

class Soldiers implements chess{
    public void moves(){
        System.out.println("Right, Left, Down, Up - only one step");
    }
}