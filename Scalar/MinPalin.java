package Scalar;

public class MinPalin {
  public static int solve(String A) {
    int s = 0, e = A.length() - 1;
    int add = 0;
    while (s < e) {
      if (A.charAt(s) != A.charAt(e)) {
        add++;
        s = add;
        e = A.length() - 1;
      } else {
        s++;
        e--;
      }
    }
    return add;
  }

  public static void main(String[] args) {
    String arr = "aabb";
    System.out.println(solve(arr));
  }
}
