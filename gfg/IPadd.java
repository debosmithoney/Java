package gfg;

import java.math.BigInteger;

public class IPadd {
  public static void main(String[] args) {
    String ip = "4.484.071.712218.6829.32313727396.08046.00";
    System.out.println(newIPAdd(ip));
  }

  public static String newIPAdd(String S) {
    String[] ipAdd = S.split("\\.");
    BigInteger[] ipadd2 = new BigInteger[ipAdd.length];
    String res = "";
    for (int i = 0; i < ipAdd.length; i++) {
      ipadd2[i] = BigInteger.valueOf(Long.valueOf(ipAdd[i]));
      res += ipadd2[i] + ".";
    }
    return res.substring(0, res.length() - 1);
  }
}
