public class Stocks{
    public int maxProfit(int[]prices){
        int buy = prices[0];
        int max = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
              buy=prices[i]; 
            }
            else {
                int profit=prices[i]-buy;
                if(profit>max){
                    max = profit;
                }
            }
        }

        return max;
    }
    public static void main(String[]args){
            int arr[]={1,2,5,3,4};

            
                System.out.println(new Stocks().maxProfit(arr));
    }
}