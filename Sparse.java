//Link: https://onecompiler.com/java/3xctrxt8a

public class Sparse {
    public static void main(String[] args) {
        int i, j, k, r, c, n = 3;
        r = c = n;
        int sm[][] = new int[][] { { 0, 1, 0 }, { 0, 0, 5 }, { 8, 7, 0 } };
        int t[][] = new int[n * n][3];
        k = 1;
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                if (sm[i][j] != 0) {
                    t[k][0] = i;
                    t[k][1] = j;
                    t[k][2] = sm[i][j];
                    k++;
                }
            }
        }
        t[0][0] = r;
        t[0][1] = c;
        t[0][2] = k - 1;
        if ((2 * (k - 1)) > (r * c))
            System.out.println("Not a Sparse matrix");
        else
            System.out.println("Sparse Matrix");
        System.out.println("Triplet Format:");
        for (i = 0; i <= k - 1; i++)
            System.out.println(t[i][0] + "  " + t[i][1] + "  " + t[i][2]);
    }
}