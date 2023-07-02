package OOPS;

public class abstraction {
    public static void main(String[] args){
        Horse b1 = new Horse();
        b1.Eat();
        b1.legs();
    }
}

abstract class Animal{
    void Eat(){
        System.out.println("Yeah, This Can Eat the Food to Live 🍉");
    }

    abstract void legs();
}

class Horse extends Animal{
    void legs(){
        System.out.println("It has 4 Legs");
    }
}

class Hen extends Animal{
    void legs(){
        System.out.println("It has 2 Legs");
    }
}