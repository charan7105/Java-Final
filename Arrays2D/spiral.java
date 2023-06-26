package Arrays2D;
import java.util.*;

public class spiral {

    public static void boundary(int numbers[][]){
        int StartRow = 0;
        int StartColumn = 0;
        int EndRow = numbers.length-1;
        int EndColumn = numbers[0].length-1;

        while(StartRow <= EndRow && StartColumn <= EndColumn){

            //First Row Print Cheyadaniki 
            for(int j=StartColumn ; j<=EndColumn;j++){
                System.out.print(numbers[StartRow][j]+" ");
            }

            //Right Column print chyadaniki
            for(int i=StartRow+1;i<=EndRow;i++){
                System.out.print(numbers[i][EndColumn]+" ");
            }

            //Bottom Print ki 
            for(int j=EndColumn-1;j>=StartColumn;j--){
                if(StartRow==EndRow){
                    break;
                }
                System.out.print(numbers[EndRow][j]+" ");
            }

            //Left Boundary print ki 
            for(int i=EndRow-1;i>=StartRow+1;i--){
                if(StartColumn==EndColumn){
                    break;
                }
                System.out.print(numbers[i][StartColumn]+" ");
            }

            StartColumn++;
            StartRow++;
            EndColumn--;
            EndRow--;

            
        }
        System.out.println();
    }
    public static void main(String[] args){
        int numbers[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // System.out.println(Arrays.deepToString(numbers));
        boundary(numbers);
    }
}