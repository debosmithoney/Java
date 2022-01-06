//Link: https://onecompiler.com/java/3xctrjg7v

import java.io.*;
public class VOperations {
    public int[] initializer(){
        int[] nums = {11,6,77,8,5,44,6,9,442,86,73,49,68,82};
        return nums;
    }
    public int linearSearch(int[] nums){
        int key = 22;
        for(int i=0;i<nums.length;i++){    
            if(nums[i] == key){    
                return i;    
            }    
        }    
        return -1;  
    }
    public int binSearch(int[] nums ,int l, int n, int key){
        int r = nums.length;
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == key)
                return mid;
            if (nums[mid] > key)
                return binSearch(nums, l, mid - 1, key);
            return binSearch(nums, mid + 1, r, key);
        }
        return -1;
    }
    public int[] bubbleSort(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (nums[j] > nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
        return nums;

    }
    public static void main(String[] args)throws IOException{
        VOperations obj = new VOperations();
        int[] nums = obj.initializer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Enter 0 for Linear Search\n   1 for binary search\n   2 for BubbleSort:  ");
        int ch = Integer.parseInt(br.readLine());
        switch (ch) {
            case 0:
            System.out.println(obj.linearSearch(nums));
            break;
            case 1:
            System.out.println(obj.binSearch(nums,0,nums.length,11));
            break;
            case 2:
            for (int i = 0; i < nums.length;i++){
                System.out.print(obj.bubbleSort(nums)[i]+" ");
            }
        }
    }
}
