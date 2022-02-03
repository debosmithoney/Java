public class nQueen {
  public static void main(String[] args) {
    int board[][] = new int[4][4];
    nQueens(board, 0);
  }

  static boolean nQueens(int board[][], int row) {
    if (row == board.length) {
      for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board.length; j++){
          System.out.print(board[i][j]+" ");
        }
        System.out.println();
      }
      return true;
    }
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

    // int sqrt = (int) Math.sqrt(board.length);
    // int boxRowStart = row - row % sqrt;
    // int boxColStart = col - col % sqrt;

    // for (int r = boxRowStart; r < boxRowStart + sqrt; r++) {
    // for (int d = boxColStart; d < boxColStart + sqrt; d++) {
    // if (board[r][d] == 1) {
    // return false;
    // }
    // }
    // }

    // if there is no clash, it's safe
    return true;
  }

}
