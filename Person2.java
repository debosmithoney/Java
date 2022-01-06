class TestCase{
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.display();
    }
}

class Person2 {
    void message() {
        System.out.println("This is person class");
    }
}
class Student2 extends Person2{
    void message() {
        System.out.print("This is student class");
    }
    void display(){
        System.out.print("\nMy Parent's Message was\t: ");
        super.message();
        System.out.print("My Child's Message was\t: ");
        message();
    }
}
