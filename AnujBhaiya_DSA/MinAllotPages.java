package AnujBhaiya_DSA;

public class MinAllotPages {
  public static void main(String[] args) {
    int[] n = {10,10,20,30};
    System.out.println(minPages(n,2));
  }

  public static int maxOf(int[] a) {
    int max = a[0];
    for (int i = 1; i < a.length; i++) {
      max = Math.max(a[i], max);
    }
    return max;
  }
  public static int sumOf(int[] a) {
    int sum = a[0];
    for (int i = 1; i < a.length; i++) {
      sum += a[i];
    }
    return sum;
  }

  public static int minPages(int[] a, int k) {
    int min = maxOf(a);
    int max = sumOf(a);
    int res =0;
    while(min<=max) {
      int mid =  (max+min)/2;
      if(isFeasible(a,k,mid)){
        res=mid;
        max=mid-1;
      }
      else min= mid+1;
    }
    return res;
  }

  public static boolean isFeasible(int[] a,int k, int res){
    int student =1;
    int sum =0;
    for (int i = 0; i < a.length; i++) {
      if(sum+a[i]>res) {
        student++;
        sum=a[i];
      } else sum+= a[i];
    }
    return student<=k;
  }

}
