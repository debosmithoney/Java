class BlockExample
{
  static
  {
    System.out.println("This is the static block");
    
  }
  
  BlockExample()
  {
    System.out.println("This is the constructor block");
  }
  
  void local()
  {
    System.out.println("This is the local Block");
  }

  public static void main (String[] args)
  {
    new BlockExample().local();
  }

}