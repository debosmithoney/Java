package AnujBhaiya_DSA;

public class StockBS2 {
  public static void main(String[] args) {
    int[] arr = {5,2,6,1,4,7,3,6};
    System.out.println(getProfit(arr));
  }

  static int getProfit(int[] arr) {
    int profit = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[i - 1])
        profit += arr[i] - arr[i - 1];
    }
    return profit;
  }
}
