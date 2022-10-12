import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObj {
  public static void main(String[] args) throws IOException {
    try (FileInputStream in = new FileInputStream("Study/Vehicle.dat")) {
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
