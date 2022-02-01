public class CityTelep {
  public int solve(int N, int[] A, int X, int K) {
    // Write your code here
    int i = 0;
    // while (X > 0) {
    //   X -= Math.abs(A[i] - A[i + 1]);
    //   i++;
    // }
    // if (i >= A.length)
    //   return A.length;
    // else if (i + K >= A.length)
    //   return A.length;
    // else
    //   return i + K;

    int max = A[0] - A[1];
    i=1;
    while(X> 0){
      if(max> (A[i]-A[i+1])) K--;
      else {
        X-=A[i]-A[i+1];
      }
    }
    if (i >= A.length)
      return A.length;
    else if (i + K >= A.length)
      return A.length;
    else
      return i + K;
  }
}
