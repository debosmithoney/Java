package Scalar;

public class isRect {
  public int solve(int A, int B, int C, int D) {
    if (((A == B) && (C == D)) || ((A == C) && (B == D)) || ((A == D) && (C == B)))
      return 1;
    return 0;
  }
}
