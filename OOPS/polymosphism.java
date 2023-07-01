package OOPS;

//⚡⚡⚡⚡⚡ Method OverLoading ⚡⚡⚡⚡⚡

public class polymosphism {
    public static void main(String[] args){
        Calculator calci = new Calculator();
        System.out.println(calci.sum(2,5));
        System.out.println(calci.sum((float)4.4,(float)3.7));
    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}