package ATMProject;

import java.util.*;
import java.text.*;
import java.io.*;

public class OptionMenu extends Account {
  Scanner sc = new Scanner(System.in);
  DecimalFormat df = new DecimalFormat("'$'###,##0.00");

  HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

  public void getLogin() throws IOException {
    int x = 1;
    do {
      try {
        data.put(39829, 238973);
        data.put(23872, 729379);
        System.out.println("Welcome to ATM Project!!");
        System.out.print("Enter CustomerNumber: ");
        setCustomerNumber(sc.nextInt());
        System.out.print("Enter CustomerPin:");
        setPinNumber(sc.nextInt());
      } catch (Exception e) {
        System.out.println("\n" + "Invalid Character(s). Only Numbers.");
        x = 2;
      }
      int cn = getCustomerNumber();
      int pn = getPinNumber();
      if (data.containsKey(cn) && data.get(cn) == pn)
        getAccountType();
      else
        System.out.println("Wrong Customer number or Pin Number");
    } while (x == 1);
  }

  public void getAccountType() {
    System.out.println(
        "Select the Account you want to access:\nType 1 - Checking Account\nType 2 - Saving Account\nType 3 - Exit");
    int selection = sc.nextInt();
    switch (selection) {
      case 1:
        getChecking();
        break;
      case 2:
        getSaving();
        break;
      case 3:
        System.out.println("Thank you for using the ATM,bye. \n");
        System.exit(0);
        break;
      default:
        System.out.println("INVALID CHOICE!!!");
        getAccountType();
    }
  }

  public void getChecking() {
    System.out.println(
        "Select the Account you want to access:\nType 1 - View Balance\nType 2 - Withdraw Balance\nType 3 - Deposit Funds\nType 4 - Exit");
    int selection = sc.nextInt();
    switch (selection) {
      case 1:
        System.out.println("Checking Account Balance:" + df.format(getCheckingBalance()));
        getAccountType();
        break;
      case 2:
        getCheckingWithdrawInput();
        getAccountType();
        break;
      case 3:
        getCheckingDepositInput();
        getAccountType();
        break;
      case 4:
        System.out.println("Thank you for using the ATM,bye. \n");
        break;
    }
  };

  public void getSaving() {
    System.out.println(
        "Select the Account you want to access:\nType 1 - View Balance\nType 2 - Withdraw Balance\nType 3 - Deposit Funds\nType 4 - Exit");
    int selection = sc.nextInt();
    switch (selection) {
      case 1:
        System.out.println("Checking Account Balance:" + df.format(getSavingBalance()));
        getAccountType();
        break;
      case 2:
        getSavingWithdrawInput();
        getAccountType();
        break;
      case 3:
        getSavingDepositInput();
        getAccountType();
        break;
      case 4:
        System.out.println("Thank you for using the ATM,bye. \n");
        break;
    }
  };
}
