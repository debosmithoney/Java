import java.util.Scanner;
import java.lang.String;

public class ParkingLot {
    public String vno;
    public int hours;
    public double bill;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle number: ");
        vno = sc.nextLine();
        System.out.print("Enter hours: ");
        hours = sc.nextInt();

        sc.close();
    }

    public void calculate() {
        if (hours <= 1)
            bill = 3;
        else
            bill = 3 + (hours - 1) * 1.5;
    }

    public void display() {
        System.out.printf("\n\nVehicle number: " + vno.toUpperCase());
        System.out.printf("\nHours: " + hours);
        System.out.println("\nBill: " + bill);
    }

    public static void main(String args[]) {
        ParkingLot obj = new ParkingLot();
        obj.input();
        obj.calculate();
        obj.display();
    }
}