package AnujBhaiya_DSA;

import java.lang.String;

public class palinStr {
  public static void main(String[] args) {
    System.out.println(isPalin("abcs", 0, 3));
  }

  static boolean isPalin(String str, int l, int r) {
    if (l >= r)
      return true;
    if (str.charAt(l) != str.charAt(r))
      return false;
    return isPalin(str, l + 1, r - 1);
  }
}
