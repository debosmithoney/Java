package CodeVita;

import java.text.*;
import java.util.*;

public class PrimeVilla {
  static int getDay(String week) {
    if (week.compareTo("Sun") == 0 || week.compareTo("Sunday") == 0)
      return 0;
    else if (week.compareTo("Mon") == 0 || week.compareTo("Monday") == 0)
      return 1;
    else if (week.compareTo("Tue") == 0 || week.compareTo("Tuesday") == 0)
      return 2;
    else if (week.compareTo("Wed") == 0 || week.compareTo("Wednesday") == 0)
      return 3;
    else if (week.compareTo("Thu") == 0 || week.compareTo("Thursday") == 0)
      return 4;
    else if (week.compareTo("Fri") == 0 || week.compareTo("Friday") == 0)
      return 5;
    else if (week.compareTo("Sat") == 0 || week.compareTo("Saturday") == 0)
      return 6;
    return -1;
  }

  static int getDay(int year, int month, int dy) {
    try {
      SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
      Date date = dateFormat.parse(dy + "-" + month + "-" + year);

      SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
      String day = dayFormat.format(date);

      return getDay(day);
    } catch (Exception e) {
      return -1;
    }
  }

  static boolean isLeap(int year) {
    if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0)
      return true;
    return false;
  }

  static int daysOfMonth(int year, int month) {
    if (month == 2)
      if (isLeap(year))
        return 29;
      else
        return 28;
    else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
      return 31;
    return 30;
  }

  static String solve(int yyyymmdd, int day, int n) {
    int d = (yyyymmdd % 100);
    int m = ((yyyymmdd / 100) % 100);
    int y = (yyyymmdd / 10000);
    int currDay = getDay(y, m, d);
    if (currDay == day)
      return "No 0";
    boolean prime[] = new boolean[367];
    Arrays.fill(prime, true);
    prime[0] = prime[1] = false;
    for (int i = 2; i <= 366; i++) {
      if (prime[i] == false)
        continue;
      for (int j = i + i; j <= 366; j += i)
        prime[j] = false;
    }

    for (int i = 1; i <= 366; i++) {
      d += 1;
      currDay += 1;
      currDay %= 7;
      if (d > daysOfMonth(y, m)) {
        d = 1;
        m += 1;
        if (m > 12) {
          m = 1;
          y += 1;
        }
      }
      if (prime[i] == false)
        continue;
      if ((m == 2 || m == 3 || m == 5 || m == 7 || m == 11) && currDay == day) {
        if (i > n) {
          return "No " + i;
        } else if (currDay == day) {
          return "Yes " + i;
        }
      }
    }
    return "";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int yyyymmdd = sc.nextInt();
    String dow = sc.next();
    int n = sc.nextInt();
    int day = getDay(dow);
    System.out.print(solve(yyyymmdd, day, n));
    sc.close();
  }
}