package CodeVita;

import java.util.*;

public class TicTacToe {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[][] a = new char[3][3];
    for (int i = 0; i < 3; i++) {
      String s1 = sc.nextLine();
      for (int j = 0; j < 3; j++) {
        a[i][j] = s1.charAt(j);
      }
    }
    
    sc.close();
  }
  public static int isValid(char[][] a){
    int c = 0;
    if((a[0][0] == 'O' && a[0][1] == 'O' &&  a[0][2] == 'O') || (a[0][0] == 'X' && a[0][1] == 'X' &&  a[0][2] == 'X')) c++;
    if((a[1][0] == 'O' && a[1][1] == 'O' &&  a[1][2] == 'O') || (a[1][0] == 'X' && a[1][1] == 'X' &&  a[1][2] == 'X')) c++;
    if((a[2][0] == 'O' && a[2][1] == 'O' &&  a[2][2] == 'O') || (a[2][0] == 'X' && a[2][1] == 'X' &&  a[2][2] == 'X')) c++;
    if((a[0][0] == 'O' && a[1][0] == 'O' &&  a[1][1] == 'O') || (a[0][0] == 'X' && a[1][0] == 'X' &&  a[1][1] == 'X')) c++;
    if((a[0][0] == 'O' && a[1][1] == 'O' &&  a[2][2] == 'O') || (a[0][0] == 'X' && a[1][1] == 'X' &&  a[2][2] == 'X')) c++;
    if((a[0][2] == 'O' && a[1][1] == 'O' &&  a[2][0] == 'O') || (a[0][2] == 'X' && a[1][1] == 'X' &&  a[2][0] == 'X')) c++;
    if((a[0][1] == 'O' && a[1][1] == 'O' &&  a[2][1] == 'O') || (a[0][1] == 'X' && a[1][1] == 'X' &&  a[2][1] == 'X')) c++;
    return c;
  }
}
