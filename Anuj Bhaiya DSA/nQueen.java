public class nQueen {
  public static void main(String[] args) {
    
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
}
