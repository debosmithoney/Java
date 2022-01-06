import java.util.Scanner;
import java.lang.String;

public class RailwayTicket {
    public String name;
    public String coach;
    public long mobno;
    public int amt;
    public int totalamt;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter coach: ");
        coach = sc.nextLine();
        System.out.print("Enter mobile no: ");
        mobno = sc.nextLong();
        System.out.print("Enter amount: ");
        amt = sc.nextInt();

        sc.close();
    }

    public void update() {
        if (coach.equalsIgnoreCase("First_AC"))
            totalamt = amt + 700;
        else if (coach.equalsIgnoreCase("Second_AC"))
            totalamt = amt + 500;
        else if (coach.equalsIgnoreCase("Third_AC"))
            totalamt = amt + 250;
        else if (coach.equalsIgnoreCase("Sleeper"))
            totalamt = amt;
    }

    public void display() {
        System.out.println("\n\nName: " + name);
        System.out.println("Coach: " + coach);
        System.out.println("Total Amount: " + totalamt);
        System.out.println("Mobile number: " + mobno);
    }

    public static void main(String args[]) {
        RailwayTicket obj = new RailwayTicket();
        obj.accept();
        obj.update();
        obj.display();
    }
}