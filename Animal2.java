class Testing2
{
  public static void main (String[] args)
  {
    Animal2 ob1 = new Dog2();
    Animal2 ob2 = new Tiger2();
    ob1.sound();
    ob2.sound();
  } 
}
class Animal2
{
  void sound()
  {
    System.out.println("Sound of Animals, which varies");
  }
}

class Dog2 extends Animal2
{
  void sound()per
  {
    System.out.println("Barking");
  }
}

class Tiger2 extends Animal2
{
  void sound()
  {
    System.out.println("Roaring");
  }
}