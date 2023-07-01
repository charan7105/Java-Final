package OOPS;

public class inheritance {
    public static void main(String[] args){
        Dogs lab = new Dogs();
        // lab.eat("Biscuits"); 🔥🔥Another Option🔥🔥
        lab.eat= "Biscuits";
        System.out.println(lab.geteat());
    }
}

class Animals{
    String SkinColor;
    String eat;
    // void seteat(String eat){
    //     this.eat = eat;
    // }
    
    String geteat(){
        return this.eat;
    }
}

class Mamals extends Animals{
    String legs;
    void setlegs(String legs){
        this.legs = legs;
    }

    String getlegs(){
        return this.legs;
    }
}

class Dogs extends Mamals{
    String breed;
}
