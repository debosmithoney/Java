package CodeVita;

import java.util.*;

public class SimpleGame {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] board = new char[9];
    int[][] win = { { 0, 1, 2 },
        { 3, 4, 5 },
        { 6, 7, 8 },
        { 0, 3, 6 },
        { 1, 4, 7 },
        { 2, 5, 8 },
        { 0, 4, 8 },
        { 2, 4, 6 } };

    for (int i = 0; i < 3; i++) {
      char temp[] = sc.nextLine().toCharArray();
      for (int j = 0; j < 3; j++) {
        board[i * 3 + j] = temp[j];
      }
    }
    sc.close();

    System.out.print(isValid(board, win) ? "YES" : "NO");
  }

  static boolean isCWin(char[] board, char ch, int[][] win) {
    for (int i = 0; i < 8; i++)
      if (board[win[i][0]] == ch &&
          board[win[i][1]] == ch &&
          board[win[i][2]] == ch)
        return true;
    return false;
  }

  static boolean isValid(char[] board, int[][] win) {
    int xCount = 0, oCount = 0;
    for (int i = 0; i < 9; i++) {
      if (board[i] == 'X')
        xCount++;
      if (board[i] == 'O')
        oCount++;
    }
    if (xCount == oCount || xCount == oCount + 1) {
      if (isCWin(board, 'O', win) == true) {
        if (isCWin(board, 'X', win) == true) {
          return false;
        }

        return (xCount == oCount);
      }

      if (isCWin(board, 'X', win) && xCount != oCount + 1) {
        return false;
      }
      return true;
    }

    return false;
  }
}