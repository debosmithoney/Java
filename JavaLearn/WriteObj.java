package JavaLearn;

import java.io.*;

public class WriteObj {
  public static void main(String[] args) {
    Vehicle12 bike = new Vehicle12("bike", 2682);
    Vehicle12 car = new Vehicle12("car", 2682);

    try (FileOutputStream os = new FileOutputStream("File-Handling/Study/Vehicle.dat")) {
      try (ObjectOutputStream obj = new ObjectOutputStream(os)) {
        obj.writeObject(bike);
        obj.writeObject(car);
        System.out.println("Written on File \n\n");
      }
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
