package AnujBhaiya_DSA;

public class RotSortBinSearch {
  
  public static void main(String[] args) {
    int[] n = { 5, 6, 7, 8, 9, 10, 1, 2, 3, 4 };
    System.out.println(bSearch(n, 10)+1);
  }

  public static int bSearch(int[] arr,int key){
    int low =0;
    int high = arr.length-1;
    while(low<=high) {
      int mid = (high + low) / 2;
      if(arr[mid] == key) return mid;
      if(arr[low]< arr[mid]){
        if(key>=arr[low] && key<arr[mid]) high = mid-1;
        else low= mid+1;
      }
      else{
        if(key>arr[mid] && key<arr[high]) low=mid+1;
        else high = mid - 1;
      }
    }
    return -1;
  }
}
