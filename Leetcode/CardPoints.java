//link:https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

public class CardPoints {
  public static void main(String[] args) {
    int[] cardPoints = { 1, 79, 80, 1, 1, 1, 200, 1 };
    System.out.println(maxScore(cardPoints, 3));
  }

  public static int maxScore(int[] cardPoints, int k) {
    int i = 0, sum = 0;
    ;
    while (i < k) {
      sum += Math.max(cardPoints[i], cardPoints[cardPoints.length - 1 - i]);
      System.out.println(sum);
      i++;
    }
    return sum;
  }
}
