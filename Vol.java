public class Vol {
    double volume(double r) {
        double vol = (4 / 3.0) * (22 / 7.0) * r * r * r;
        return vol;
    }

    double volume(double h, double r) {
        double vol = (22 / 7.0) * r * r * h;
        return vol;
    }

    double volume(double l, double b, double h) {
        double vol = l * b * h;
        return vol;
    }

    public static void main(String args[]) {
        Vol obj = new Vol();
        System.out.printf("Sphere Volume = %.3f\n",obj.volume(4));
        System.out.printf("Cylinder Volume = %.3f\n",obj.volume(6.2, 4.6));
        System.out.printf("Cuboid Volume = %.3f\n",obj.volume(8.5, 4.6, 6.2));
    }
}