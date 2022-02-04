package AnujBhaiya_DSA;

public class Rainwater {
  public static void main(String[] args) {
    int[] a = {3,1,2,4,0,1,3,2};
    System.out.println(getStoreage(a));
  }

  static int getStoreage(int[] a) {
    int[] left = new int[a.length];
    int[] right = new int[a.length];
    left[0] = a[0];

    for (int i = 1; i < a.length; i++)
      left[i] = Math.max(left[i - 1], a[i]);
    
    right[a.length - 1] = a[a.length - 1];
    for (int i = a.length - 2; i >= 0; i--)
      right[i] = Math.max(right[i + 1], a[i]);
    int ans = 0;
    for (int i = 0; i < a.length; i++)
      ans = (Math.min(left[i], right[i]) - a[i]);
    return ans;
  }
}
