public class BuySellStock {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<=1)
            return 0;
        int min=prices[0];
        int result=0;
        for(int i=1; i<prices.length; i++){
            result = Math.max(result, prices[i]-min);
            min = Math.min(min, prices[i]);
        }
        return result;
    }
    public static void main(String[] args){
        int[] p = {7,6,4,3,1};
        BuySellStock obj = new BuySellStock();
        System.out.println(obj.maxProfit(p));
    }
}
