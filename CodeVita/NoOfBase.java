package CodeVita;

public class NoOfBase {
  public static void main(String[] args) {
    int arr[] = { 6, 9, 11, 24 };
    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      for (int j = 2; j < arr[j]; j++) {
        int base = (int) (Math.log(arr[j]) / Math.log(j));
        int digit = (int) (arr[j] / Math.pow(j, base));
        if (digit == 1)
          count++;
      }
      System.out.println(count + 1);
    }
  }
}
