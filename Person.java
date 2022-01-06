class Testing {
    public static void main(String[] args) {
        Manager2 obj1 = new Manager2();
        System.out.printf("\n");
        Manager2 obj2 = new Manager2(4);
        System.out.printf("\n");
        Manager2 obj3 = new Manager2(4, 8);
    }
}

class Person {

    public Person() {}

    public Person(int i) {}

    public Person(int i, int j) {}
}

class Employee1 extends Person {

    public Employee1() {}

    public Employee1(int i) {
        super(i);
        System.out.println(i);
    }

    public Employee1(int i, int j) {
        super(i, j);
        System.out.println(i+" "+j);
    }
}

public class Manager2 extends Employee1 {

    public Manager2() {
    }

    public Manager2(int i) {
        super(i);
        System.out.println(i);
    }

    public Manager2(int i, int j) {
        super(i, j);
        System.out.println(i+" "+j);
    }
}
