package Problems;

public class stocks {

    public static void SellBuy(int prices[]){
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            
            for(int j=i+1;j<prices.length;j++){
                if(prices[j] > sell){
                    sell = prices[j];
                }
            }
        }
        int profit = sell-buy;
        System.out.println("buy when the price is = "+buy);
        System.out.println("Sell when the price is = "+sell);
        System.out.println("Then you will get the profit = "+profit);
    }
    public static void main(String[] args){
        int prices[] = {7, 1, 5, 3, 6, 4};
        SellBuy(prices);
    }
}
