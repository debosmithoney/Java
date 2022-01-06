import java.util.Scanner;

public class Area {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.printf("Area of parallelogram = %.4f",obj.area(base, height));
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.printf("Area of rhombus = %.4f",obj.area(0.5, d1, d2));
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.printf("Area of trapezium = %.4f",obj.area(0.5, a, b, h));
    
        sc.close();
    }
    public double area(double base, double height) {
        return base * height;
    }
    public double area(double c, double d1, double d2) {
        return c * d1 * d2;
    }
    public double area(double c, double a, double b, double h) {
        return c * (a + b) * h;
    }
}