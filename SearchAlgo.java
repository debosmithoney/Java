
// import java.util.*;
import java.io.*;
import java.util.Arrays;
class Search {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        System.out.println("Elements: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Value: ");
        int value = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        int flag = 0;
        int low = 0;
        int high = arr.length-1; // n-1
        do {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                System.out.println("Found at " + mid);
                flag = 1;
                break;
            } else if (arr[mid] < value){
                low = mid + 1;
                System.out.println("deducted");
            }
            else if (arr[mid] > value){
                high = mid - 1;
                System.out.println("Added");

            }
        } while (low <= high);
        if (flag == 0) {
            System.out.println("Not found");
        }
    }
}
