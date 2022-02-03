package AnujBhaiya_DSA;

public class Sudoku {
  public static void main(String[] args) {
    int[][] board = new int[][] {
        { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
        { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
        { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
        { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
        { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
        { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
        { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
    };
    int N = board.length;
    sudoku(board, N);
  }

  static boolean isSafe(int[][] board, int row, int col, int num) {

    for (int i = 0; i < board.length; i++)
      if (board[row][i] == num)
        return false;
    for (int i = 0; i < board.length; i++)
      if (board[i][col] == num)
        return false;

    int sqrt = (int) Math.sqrt(board.length);
    int boxRow = row - row % sqrt;
    int boxCol = col - col % sqrt;
    for (int i = boxRow; i < boxRow + sqrt; i++) {
      for (int j = boxCol; j < boxCol + sqrt; j++) {
        if (board[i][j] == num)
          return false;
      }
    }
    return true;
  }

  public static boolean sudoku(int[][] board, int n) {
    int row = -1, col = -1;
    boolean isEmpty = true;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[i][j] == 0) {
          row = i;
          col = j;
          isEmpty = false;
          break;
        }
      }
      if (isEmpty == false)
        break;
    }
    if (isEmpty) {
      for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board.length; j++) {
          System.out.print(board[i][j] + " ");
        }
        System.out.println();
      }
      return true;
    }

    for (int i = 1; i <= n; i++) {
      if (isSafe(board, row, col, i)) {
        board[row][col] = i;
        if (sudoku(board, n))
          return true;
        else
          board[row][col] = 0;
      }
    }
    return false;
  }
}
