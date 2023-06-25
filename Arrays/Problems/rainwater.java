package Problems;

public class rainwater {
    public static void rainwater(int height[]){
        int maxleft[] = new int[height.length];
        int maxright[] = new int[height.length];

        maxleft[0]=height[0];
        for(int i=1;i<height.length;i++){
            maxleft[i] = Math.max(height[i], maxleft[i - 1]);
        }

        maxright[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            maxright[i] = Math.max(height[i], maxright[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < height.length; i++){
            trappedWater += Math.min(maxleft[i], maxright[i]) - height[i];
        }

        System.out.println("Trapped Water: " + trappedWater);
    }
    public static void main(String[] args){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        rainwater(height);
    }
}
