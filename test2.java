import java.lang.String;
public class test2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        String total = "";
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            // Addition of String Either Adding more Space
        }
        System.out.println(total);
        
    }
}
// Space Complexity : number of array inputs = n