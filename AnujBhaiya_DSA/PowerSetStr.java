package AnujBhaiya_DSA;

import java.lang.String;

public class PowerSetStr {
  public static void main(String[] args) {
    String str= "abcd";
    powerset(str,0,"");
  }
  static void powerset(String s,int i, String cur){
    if(i==s.length()){
      System.out.println(cur);
      return;
    } 
    powerset(s,i+1, (cur + s.charAt(i)));
    powerset(s,i+1,cur);
  }
}
