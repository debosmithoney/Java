import java.io.*;
import java.lang.String;

public class CallLogs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: " );
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter Names and thier time: " );
        String[] names = new String[n];
        float[] time = new float[n];
        for (int i = 0; i < n; i++) {
            names[i] = br.readLine();
            time[i] = Float.parseFloat(br.readLine());
        }
        System.out.println("Enter Your Start and End in hours: " );
        int s = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            if (time[i] >= s && time[i] <= e)
            System.out.println(names[i]);
        }

    }
}
