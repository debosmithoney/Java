class Dataout2
{
  public static void main (String[] args)
  {
    Parent1 p = new Parent1();
    p.show();
    
    Child1 c = new Child1();
    c.show();
    
    c.display();
  }

}

class Parent1
{
  void show()
  {
    System.out.println("This is Parent Class");
  }
}

class Child1 extends Parent1
{
  void show()
  {
    System.out.println("This is Child Class");
  }
  
  void display()
  {
    super.show();
  }
}



