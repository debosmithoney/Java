package ATMProject;

import java.text.*;
import java.util.*;

public class Account {
  private int customerNumber;
  private int pinNumber;
  private double checkingBalance = 0.0;
  private double savingBalance = 0.0;

  Scanner sc = new Scanner(System.in);
  DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

  public int setCustomerNumber(int customerNumber) {
    this.customerNumber = customerNumber;
    return customerNumber;
  }

  public int getCustomerNumber() {
    return customerNumber;
  }

  public int setPinNumber(int pinNumber) {
    this.pinNumber = pinNumber;
    return pinNumber;
  }

  public int getPinNumber() {
    return pinNumber;
  }

  public double getCheckingBalance() {
    return checkingBalance;
  }

  public double getSavingBalance() {
    return savingBalance;
  }

  public double calcCheckingWithdraw(double amount) {
    return checkingBalance -= amount;
  }

  public double calcSavingWithdraw(double amount) {
    return savingBalance -= amount;
  }

  public double calcCheckingDeposit(double amount) {
    return checkingBalance += amount;
  }

  public double calcSavingDeposit(double amount) {
    return savingBalance += amount;
  }

  public void getCheckingWithdrawInput() {
    System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
    System.out.print("Amount you want to withdraw from Checking Account: ");
    double amount = sc.nextDouble();
    if ((checkingBalance - amount) >= 0) {
      calcCheckingWithdraw(amount);
      System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
    } else {
      System.out.println("Balance cannot be Negative");
    }
  }

  public void getSavingWithdrawInput() {
    System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
    System.out.print("Amount you want to withdraw from Saving Account: ");
    double amount = sc.nextDouble();
    if ((savingBalance - amount) >= 0) {
      calcSavingWithdraw(amount);
      System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
    } else {
      System.out.println("Balance cannot be Negative");
    }
  }

  public void getCheckingDepositInput() {
    System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
    System.out.print("Amount you want to Deposit from Checking Account: ");
    double amount = sc.nextDouble();
    if ((checkingBalance + amount) >= 0) {
      calcCheckingDeposit(amount);
      System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
    } else {
      System.out.println("Balance cannot be Negative");
    }
  }

  public void getSavingDepositInput() {
    System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
    System.out.print("Amount you want to Deposit from Saving Account: ");
    double amount = sc.nextDouble();
    if ((savingBalance + amount) >= 0) {
      calcSavingDeposit(amount);
      System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
    } else {
      System.out.println("Balance cannot be Negative");
    }
  }

}
