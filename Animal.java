class Test24{
    public static void main(String[] args){
        Animal a = new Animal();
        a.sound();
        Dog d = new Dog();
        Tiger t = new Tiger();
        System.out.println("Dog class overides Animal Class  :\n"+d.hasLife());
        System.out.println(d.hasTail());
        System.out.println(d.noOfEyes());
        System.out.println(d.noOfLegs());
        d.sound();
        System.out.println("Tiger class overides Animal Class :\n"+t.hasLife());
        System.out.println(t.hasTail());
        System.out.println(t.noOfEyes());
        System.out.println(t.noOfLegs());
        t.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Sound of Animals, which varies");
    }

    boolean hasLife() {
        return true;
    }

    boolean hasTail() {
        return true;
    }

    int noOfEyes() {
        return 2;
    }

    int noOfLegs() {
        return 4;
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Barking");
    }
}

class Tiger extends Animal {
    void sound() {
        System.out.println("Roaring");
    }
}