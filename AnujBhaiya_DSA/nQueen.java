package AnujBhaiya_DSA;

public class nQueen {
  public static void main(String[] args) {
    int n = 5;
    int board[][] = new int[n][n];
    nQueens(board, 0);
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  static boolean nQueens(int board[][], int row) {
    if (row == board.length)
      return true;
    for (int col = 0; col < board.length; col++) {
      if (isSafe(board, row, col)) {
        board[row][col] = 1;
        if (nQueens(board, row + 1))
          return true;
        board[row][col] = 0;
      }
    }
    return false;
  }

  public static boolean isSafe(int[][] board,
      int row, int col) {
    for (int d = 0; d < board.length; d++) {
      if (board[row][d] == 1) {
        return false;
      }
    }
    for (int r = 0; r < board.length; r++) {
      if (board[r][col] == 1) {
        return false;
      }
    }

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (i == j && board[i][j] == 1)
          return false;
        if (i + j == board.length - 1 && board[i][j] == 1)
          return false;
      }
    }
    return true;
  }

}
