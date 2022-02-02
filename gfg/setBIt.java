package gfg;

public class setBIt {

  public static int findPosition(int N) {
    int c=0;
    if (N>0 && ((N & (N-1))==0)) {
      while(N>0){
        N >>=1;
        c++;
      }
    }
    else return -1;
    return c;
  }

  public static void main(String[] args) {
    System.out.println(setBIt.findPosition(5));
  }
}
