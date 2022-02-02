public class palinStr {
  public static void main(String[] args) {
    System.out.println(isPalin("abcs",0,3));
  }
  static boolean isPalin(java.lang.String string, int l, int r) {
    if(l>=r) return true;
    if(string.charAt(l)!=string.charAt(r)) return false;
    return isPalin(string,l+1,r-1);
  }
}
