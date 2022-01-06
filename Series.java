public class Series {
    double series(double n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double term = 1.0 / i;
            sum += term;
        }
        return sum;
    }

    double series(double a, double n) {
        double sum = 0;
        int x = 1;
        for (int i = 1; i <= n; i++) {
            int e = x + 1;
            double term = x / Math.pow(a, e);
            sum += term;
            x += 3;
        }
        return sum;
    }

    public static void main(String args[]) {
        Series obj = new Series();
        System.out.printf("First series sum = %.4f\n", obj.series(5));
        System.out.printf("Second series sum = %.4f\n", obj.series(3, 8));
    }
}