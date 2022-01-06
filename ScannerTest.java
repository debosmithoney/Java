import java.util.*;
import java.lang.String;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        System.out.println("name: " + line);
        scan.close();
    }
}
