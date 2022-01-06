import java.util.*;

public class k1 {
    public static void main(String[] args) {
        int i, n = 5;
        boolean f = false;
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (i = 0; i < n; i++) {
            a.add((i + 1) + 10);
        }
        System.out.println(a);

        a.add(3, 60);
        System.out.println(a);

        for (i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

        for (i = 0; i < a.size(); i++) {
            if (a.get(i) >= 30 && a.get(i) <= 50)
                System.out.println("Index Found at " + i);
            f = true;
        }
        if (f == false)
            System.out.println("Not Found");

        ArrayList<Integer> second = new ArrayList<Integer>(Arrays.asList(-60,-70,-80));
        a.addAll(second);
        System.out.println(a);
        a.add(2,999);
        System.out.println(a);
        for (i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
