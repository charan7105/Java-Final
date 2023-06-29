package strings;

public class shortestpath{

    public static double pathfinder(String path){
        int x =0;
        int y=0;

        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'W'){
                x--;
            }
            else if(dir == 'E'){
                x++;
            }
            else if(dir == 'S'){
                y--;
            }
            else{
                y++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return Math.sqrt(X2+Y2);
    }
    public static void main(String[] args){
        String path = "WNEENESENNN";
        System.out.println("The Shortest Path is: "+pathfinder(path));
    }
} 