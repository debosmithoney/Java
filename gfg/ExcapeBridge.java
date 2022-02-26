//Link:https://practice.geeksforgeeks.org/problems/a4f19ea532cee502aabec77c07e0d0a45b76ecf9/1
package gfg;

public class ExcapeBridge {
  public static void main(String[] args) {

  }

  public static int build_bridges(String str1, String str2) {
    int n = str1.length();
    int m = str2.length();
    int temp[][] = new int[n + 1][m + 1];

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {

        if (str1.charAt(i - 1) == str2.charAt(j - 1))
          temp[i][j] = temp[i - 1][j - 1] + 1;

        else
          temp[i][j] = Math.max(temp[i - 1][j], temp[i][j - 1]);
      }
    }

    return temp[n][m];
  }
}
