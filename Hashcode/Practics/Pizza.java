import java.util.*;
import java.io.*;
public class Pizza{

    public static void reqPizza(ArrayList<ArrayList<String>> arr , int k ){
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                set.add(arr.get(i).get(j));
                set.remove(arr.get(i+k).get(j));
            }
        }
        System.out.println(set);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < n; i++) {
            String s1 = br.readLine();
            String str[] = s1.split("\\s+");
            int k = Integer.parseInt(str[0]);
            for (int j = 1; j < k; j++) {
                arr.get(i).add(str[j]);
            }
            String s2 = br.readLine();
            String str1[] = s2.split("\\s+");
            int k1 = Integer.parseInt(str[0]);
            for (int j = 1; j < k1; j++) {
                arr.get(i+n).add(str1[j]);
            }
        }
        Pizza.reqPizza(arr, n);
    }
}