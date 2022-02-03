package AnujBhaiya_DSA;

import java.lang.String;

public class permuteStr {
  static void printPermutn(String str, String ans) {
    if (str.length() == 0) {
      System.out.print(ans + " ");
      return;
    }

    for (int i = 0; i < str.length(); i++) {
      String ros = str.substring(0, i) + str.substring(i + 1);
      printPermutn(ros, ans + str.charAt(i));
    }
  }

  public static void main(String[] args) {
    String s = "abba";
    printPermutn(s, "");
  }
}
