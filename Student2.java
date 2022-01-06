import java.lang.String;
import java.util.ArrayList;

class Student2 {
    String name;
    int age, roll, marks;

    Student2(String name, int age, int roll, int marks) {
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.marks = marks;
    }

    public String toString() {
        return name + "--" + age + "--" + roll + "--" + marks;
    }

    public String getName() {
        return name;
    }

    public int  getAge() {
        return age;
    }
    public int getRoll() {
        return roll;
    }
    public int getMark() {
        return marks;
    }
}

class Call {
    void work() {
        ArrayList<Student2> db = new ArrayList<Student2>(10);
        Student2 s = new Student2("Riya", 56, 23, 76);
        db.add(s);
    }

}
