import java.io.*;
public class RottingOranges {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[50][50];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                arr[i][j] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
