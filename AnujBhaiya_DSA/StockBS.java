package AnujBhaiya_DSA;

public class StockBS {
  public static void main(String[] args) {
    int a[] = { 5, 2, 6, 1, 8 };
    System.out.println(maxProfit(a));
  }

  static int maxProfit(int[] a) {
    int maxProfit = 0;
    int minValue = a[0];
    for (int i = 0; i < a.length; i++) {
      minValue = Math.min(minValue, a[i]);
      int Profit = a[i] - minValue;
      maxProfit = Math.max(maxProfit, Profit);
    }
    return maxProfit;
  }
}
