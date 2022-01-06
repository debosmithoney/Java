import java.util.Arrays;
public class SqofSortAr {
    public int[] sortedSquares(int[] nums){
        int array[] = new int[nums.length];
        for(int i = 0; i < nums.length;i++){
            array[i] = (int) Math.pow(nums[i],2);
        }
        Arrays.sort(array);
        return array;
    }
    public static void main(String[] args){
        int[] nums = {-7,-3,2,3,11};
        SqofSortAr obj = new SqofSortAr();
        for(int i = 0; i < nums.length;i++){
            System.out.print(obj.sortedSquares(nums)[i]+" ");
        }
    }
}
