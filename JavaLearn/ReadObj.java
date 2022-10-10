package JavaLearn;

import java.io.*;

import JavaLearn.Vehicle12;

public class ReadObj {
  public static void main(String[] args) {
    try (FileInputStream in = new FileInputStream("File-Handling/Study/Vehicle.dat")) {
      try (ObjectInputStream ois = new ObjectInputStream(in)) {
        Vehicle12 v1 = (Vehicle12) ois.readObject();
        System.out.println("Object 1: " + v1);
        Vehicle12 v2 = (Vehicle12) ois.readObject();
        System.out.println("Object 1: " + v2);
      } catch (ClassNotFoundException e) {
        System.out.println("Error: " + e.getMessage());
      }
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
