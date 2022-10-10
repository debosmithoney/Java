//Parenthesis Matching Problem
package AnujBhaiya_DSA;

import java.util.*;

public class ParenMatch {
  public static void main(String[] args) {
    String str = "(([])";
    System.out.println(match(str));
  }

  public static boolean match(String str) {
    Stack<Character> s = new Stack<Character>();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (isOpening(c)) {
        s.push(c);
      } else {
        if (s.isEmpty())
          return false;
        else if (!isClosing(s.peek(), c))
          return false;
        else
          s.pop();
      }
    }
    return s.isEmpty();
  }

  public static boolean isOpening(char c) {
    return (c == '(' || c == '{' || c == '[');
  }

  public static boolean isClosing(char c, char d) {
    return ((c == '(' && d == ')') || (c == '{' && d == '}') || (c == '[' && d == ']'));
  }
}
