package CodeVita;

import java.util.*;

public class Palindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    int m = sc.nextInt();
    int[] arr = new int[n];
    int sum = 0;
    int e = 0;
    for (int i = 0; i < m; i++) {
      arr[i] = sc.nextInt();
      e = check(s, i);
      sum = sum + e;
    }
    System.out.println(sum);
    sc.close();
  }

  public static int check(String s, int n) {
    ArrayList<String> al = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      String st = "";
      for (int j = i; j < s.length(); j++) {
        st += s.charAt(i);
        if (isPalindrome(st) == true && st.length() == n) {
          al.add(st);
        }
      }
    }
    System.out.println(al);
    return al.size();
  }

  public static boolean isPalindrome(String st) {
    int i = 0, j = st.length() - 1;
    while (i < j) {

      if (st.charAt(i) != st.charAt(j))
        return false;
      i++;
      j--;
    }
    return true;
  }
}