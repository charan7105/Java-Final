public class rainwatertrappedproblem {
    public static void TrappedWater(int Height[]){
        int TrappedWater = 0;
        //Max of left 
        int MaxLeft[] = new int[Height.length];
        MaxLeft[0]=Height[0];
        for(int i=1;i<Height.length;i++)
        {
            if(Height[i] > MaxLeft[i-1]){
                MaxLeft[i] = Height[i];
            }
            else{
                MaxLeft[i] = MaxLeft[i-1];
            }
            // System.out.print(MaxLeft[i]+" ");
        }
        // System.out.println();
        
        //Max of Right
        int MaxRight[] = new int[Height.length];
        MaxRight[Height.length-1]=Height[Height.length-1];
        for(int i=Height.length-2;i>=0;i--)
        {
            if(Height[i] > MaxRight[i+1]){
                MaxRight[i] = Height[i];
            }
            else{
                MaxRight[i] = MaxRight[i+1];
            }
            // System.out.print(MaxRight[i]+" ");
        }
        // System.out.println();
        
        

        //for loop
        for(int i=0;i<Height.length;i++){
            if(MaxRight[i]<MaxLeft[i]){
                TrappedWater += MaxRight[i] - Height[i];
            }else{
                TrappedWater += MaxLeft[i]-Height[i];
            }
            System.out.println("The Water Trapped till the building no:"+(i+1)+" is "+TrappedWater);
        }
        System.out.println();
        System.out.println("So, Total Water is :"+TrappedWater);
        //Min of Left and Right
        //TrappedWater = (WaterLevel - BuildingHeight)
        // System.out.println("The Full ")
   }
    public static void main(String[] args){
        int Height[] = {4,2,0,6,3,2,5};
        TrappedWater(Height);
    }

 }