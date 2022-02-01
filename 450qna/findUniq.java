import java.util.ArrayList;
import java.util.List;

// Link: https://www.codingninjas.com/codestudio/problems/find-unique_625159?source=youtube&campaign=love_babbar_codestudio1&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio1

public class findUniq {
    int findUnique(List<Integer> arr) {
        int ans = 0;

        for (int i = 0; i < arr.size(); i++) {
            ans = ans ^ arr.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = { 1, 3, 1, 4, 4, 7, 7 };
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i : a){
            ans.add(i);
        }
        findUniq obj = new findUniq();
        System.out.println(obj.findUnique(ans));
    }
}
