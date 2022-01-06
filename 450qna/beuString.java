//Link: https://www.codingninjas.com/codestudio/problems/beautiful-string_1115625

public class beuString {
    public static int makeBeautiful(String str) {
        int a = str.charAt(0);
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        int b = sbr.charAt(0);
        int c = 0,d=0;
        for (int i = 1; i < str.length(); i = i + 2) {
            if (str.charAt(i) == a)
                c++;
            if (sbr.charAt(i) == b)
                d++;
        }
        for (int i = 0; i < str.length(); i = i + 2) {
            if (str.charAt(i) != a)
                c++;
            if (sbr.charAt(i) != b)
                d++;
        }
        return Math.min(c, d);
    }

    public static void main(String[] args) {
        String str = "01010010101";
        System.out.println(beuString.makeBeautiful(str));
    }
}
