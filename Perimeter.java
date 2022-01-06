import java.util.Scanner;

public class Perimeter
{
    public double perimeter(double s) {
        double p = 4 * s;
        return p;
    }
    
    public double perimeter(double l, double b) {
        double p = 2 * (l + b);
        return p;
    }
    
    public double perimeter(int c, double pi, double r) {
        double p = c * pi * r;
        return p;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Perimeter obj = new Perimeter();
        double side = sc.nextDouble();
        System.out.println("Perimeter of Square = " + obj.perimeter(side));
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Perimeter of Rectangle = " + obj.perimeter(l, b));
        double r = sc.nextDouble();
        System.out.printf("Perimeter of Circle = %.4f\n",obj.perimeter(2, 3.14159, r));

        sc.close();
    }   
}