public class BuySellStock2 {
    public int maxProfit(int[] prices){
        int res = 0;
        for(int i=0;i<prices.length-1;i++) {
            int min = Math.min(prices[i],prices[i+1]);
            res+=prices[i+1]-min;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] pri = {7,1,5,3,6,4};
        BuySellStock2 obj = new BuySellStock2();
        System.out.println(obj.maxProfit(pri));
    }
}
