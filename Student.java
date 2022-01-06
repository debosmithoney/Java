import java.lang.String;
class name2 {
    public static void main(String[] args) {
        Student obj = new Student("Debosmit");
        Student obj2 = new Student();
        System.out.println(obj.name);
        System.out.println(obj2.name);
    }
}

class Student {
    String name;
    public Student(String ss) {
        name = ss;
    }
    public Student() {
        name = "unknown";
    }
}
