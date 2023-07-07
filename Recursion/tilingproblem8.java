package Recursion;

public class tilingproblem8 
{
    
    public static int ways(int n)
    { //2 * N Floor Size
        //Base  
        if(n==0 || n==1)
        {
            return 1;
        }
        //Vertical
        int verticaltiles = ways(n-1);
        //Horizontal
        int horizontaltiles = ways(n-2);
        
        int TotalWays = verticaltiles + horizontaltiles;
        return TotalWays;
    }
    public static void main(String[] args)
    {
        System.out.print(ways(4));
    }
}

