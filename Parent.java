class test1
{
  public static void main (String[] args)
  {
    Parent p = new Parent();
    p.show();
    
    Child c = new Child();
    c.show();
    
    c.display();
  }

}

class Parent
{
  private void show()
  {
    System.out.println("This is Parent Class");
  }
}

class Child extends Parent
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