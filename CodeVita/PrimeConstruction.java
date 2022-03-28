package CodeVita;

import java.util.*;

public class PrimeConstruction {
  static boolean isPrime(int n) {
    if(n < 2) return false;
    
    for(int i = 2; i * i <= n; i++)
      if(n % i == 0)  return false;
    
    return true;
  }
  static int gcd(int a, int b) {
    if(b == 0)  return a;
    
    return gcd(b, a % b);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String input[] = sc.nextLine().split("\\s");
    sc.close();
    int min = Integer.MAX_VALUE, lcm = -1;
    int arr[] = new int[input.length];
    
    for(int i = 0; i < input.length; i++) {
      arr[i] = Integer.parseInt(input[i]);
      min = Math.min(min, arr[i]);
    }
    
    for(int i = 0; i < input.length; i++) {
      if(arr[i] == min) continue;
      
      if(lcm == -1) {
        lcm = arr[i] + min;
      } else {
        lcm = (lcm * (arr[i] + min)) / gcd(lcm, arr[i] + min);
      }
    }
    
    if(isPrime(lcm + min)) {
      System.out.println(lcm + min);
    } else {
      System.out.println("None");
    }
  }
}