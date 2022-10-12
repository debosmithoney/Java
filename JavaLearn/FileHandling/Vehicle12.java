import java.io.*;

public class Vehicle12 implements Serializable {
  private String Name;
  private int number;

  public Vehicle12(String Name, int number) {
    this.Name = Name;
    this.number = number;
  }

  public String toString() {
    return "Vehicle [Name=" + Name + ", number=" + number + "]";
  }
}
