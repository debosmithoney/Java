import java.io.*;
import java.lang.String;
class Column
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int result = 0;
        for (int i = 0; i < s.length(); i++)
        {
            result = result * 26;
            result = result + (s.charAt(i) - 'A' + 1);
        }
        System.out.println(result);
    }
}