import java.util.*;
import java.lang.String;

public class dtShop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    String T1 = sc.nextLine();
    int t[] = new int[3];
    for(int i = 0; i < n; i++) {
      t[i] = (int) T1.charAt(i);
    }
    String T2 = sc.nextLine();
    int j[] = new int[3];
    for(int i = 0; i < n; i++) {
      j[i] = (int) T2.charAt(i);
    }
    sc.close();
    int minT = Math.min(t[1],Math.min(t[2],t[3]));
    int minJ = Math.min(j[1],Math.min(j[2],j[3]));
    if(minT+minJ >n ) System.out.println(-1);
    else {
      
    }
  }
}
