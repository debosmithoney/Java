class OutPut {
    public static void main(String[] args) {
        Parent2 p = new Parent2();
        p.show();
        Child2 c = new Child2();
        c.show();
        c.show2();
    }
}

class Parent2 {
    void show() {
        System.out.println("Parent Class");
    }
}

class Child2 extends Parent2 {
    void show() {
        System.out.println("Child Class");
    }

    void show2() {
        super.show();
    }
}
