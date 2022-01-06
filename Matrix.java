//Link: https://onecompiler.com/java/3xctp6nec

public class Matrix {
    public int[] sumDiagonal(int[][] n) {
        int suml = 0;
        int sumr = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if (i == j)
                    suml += n[i][j];
                if (i + j == n.length)
                    sumr += n[i][j];
            }
        }
        return new int[] { suml, sumr };
    }

    public static void main(String[] args) {
        Matrix obj = new Matrix();
        int[][] nums = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
        System.out.print("Sum of left Diagonal: " + obj.sumDiagonal(nums)[0]);
        System.out.println();
        System.out.print("Sum of right Diagonal: " + obj.sumDiagonal(nums)[1]);
    }
}
