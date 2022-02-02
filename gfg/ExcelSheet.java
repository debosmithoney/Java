package gfg;

public class ExcelSheet {
  public static void main(String[] args) {
    System.out.println(excelColumn(26));
  }

  public static String excelColumn(int N) {
    // Your code here
    String str = "";
    while (N > 0) {
      int r = N % 26;
      if (r == 0) {
        str += 'Z';
        N = N / 26 - 1;
      } else {
        str += (char) ((r - 1) + 'A');
        N = N / 26;
      }
    }
    int n = str.length();
    String rev = "";
    for (int i = n - 1; i >= 0; i--) {
      rev += str.charAt(i);
    }
    return rev;
  }

  

}
