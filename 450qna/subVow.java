public class subVow {
    public static String findSubstring(String s, int k) {
        int max = 0;
        String str = "";
        if (k > s.length())
            return s;
        for (int i = 0; i <= s.length(); i++) {
            String s2 = s.substring(i, k);
            int c = 0;
            for (int j = 0; j < s2.length(); j++) {
                if (s2.charAt(j) == 'a' || s2.charAt(j) == 'e' || s2.charAt(j) == 'i' || s2.charAt(j) == 'o'
                        || s2.charAt(j) == 'u')
                    c++;
            }
            if (c > max) {
                max = c;
                str = s2;
            }
            k++;
            if(k==s.length()+1) break;
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "azerdii";
        int k = 5;
        System.out.println(subVow.findSubstring(str, k));
    }
}