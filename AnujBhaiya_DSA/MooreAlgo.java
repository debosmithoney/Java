package AnujBhaiya_DSA;

public class MooreAlgo {
  public static void main(String[] args) {
    int[] arr = {5,5,1,3,5};
    System.out.println(arr[majorityElement(arr)]);
  }
  public static int majorityElement(int[]a){
    int index =0,c=0;
    for (int i = 0; i < a.length; i++) {
      if(a[i]==a[index])c++;
      else c--;
      if(c==0){
        index=i;
        c=1;
      }
    }
    return index;
  }
}