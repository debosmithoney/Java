import java.util.*;
class Animal{
    void sound() {
        System.out.println("Sound of Animals, which varies");
    }
}
class Dog extends Animal{
    void sound() {
        System.out.println("barking");
    }
}
class Tiger extends Animal{
    void sound(){
        System.out.println("Roaring ");
    }
}


public class F4 {
    Scanner sc= new Scanner(System.in);
    String c = sc.nextLine();
    Animal ob = new Animal();
    Dog o = new Dog();
    o.sound();
}
