
import java.util.*;

public class sortStud {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] str = new String[10];
    for (int i = 0; i < str.length; i++) {
      str[i] = sc.nextLine();
    }

    System.out.println("\nBefore Sorting: ");
    for (String s : str) {
      System.out.println(s);
    }
    System.out.println("\nAfter Sorting: ");
    sortStud.sortStr(str);
    for (String s : str) {
      System.out.println(s);
    }
    sc.close();
  }

  public static String[] sortStr(String[] str) {
    for (int i = 0; i < str.length - 1; i++) {
      for (int j = i + 1; j < str.length; j++) {
        if (str[i].compareTo(str[j]) > 0) {
          String temp = str[i];
          str[i] = str[j];
          str[j] = temp;
        }
      }
    }
    return str;
  }
}
