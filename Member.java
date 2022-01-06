import java.lang.String;

class DataOut{
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.name="KakaShi";
        emp.age=21;
        emp.number=9563808;
        emp.address="Dishergarh";
        emp.salary=56000;
        emp.specialization="Web Developer";

        System.out.println("Name of the Employee: " + emp.name);
        System.out.println("Age of the Employee: " + emp.age);
        System.out.println("Number of the Employee: " + emp.number);
        System.out.println("Address of the Employee: " + emp.address);
        System.out.println("Salary of the Employee: " + emp.salary);
        System.out.println("Specialization of the Employee: " + emp.specialization);

        Manager mng = new Manager();
        mng.name="Hatake";
        mng.age=24;
        mng.number=95638;
        mng.address="Asansol";
        mng.salary=78000;
        mng.Department="Quality Control";

        System.out.println("Name of the Manager: " + mng.name);
        System.out.println("Age of the Manager: " + mng.age);
        System.out.println("Number of the Manager: " + mng.number);
        System.out.println("Address of the Manager: " + mng.address);
        System.out.println("Salary of the Manager: " + mng.salary);
        System.out.println("Specialization of the Manager: " + mng.Department);
    }
}

class Member {
    String name;
    int age;
    long number;
    String address;
    int salary;
    public void printSalary(){
        System.out.println(salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String Department;
}

