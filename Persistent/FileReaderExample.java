import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderExample {
  public static void main(String args[]) throws Exception {
    FileReader fr = new FileReader("/Users/debosmitchoudhury/Desktop/Projects/Java/Persistent/text.txt");
    int i;
    FileReader fr1 = new FileReader("/Users/debosmitchoudhury/Desktop/Projects/Java/Persistent/text2.txt");
    String str = "File Handling in Java using " +
        " FileWriter and FileReader";

    try (
        FileWriter fw = new FileWriter("output.txt")) {
      while ((i = fr.read()) != -1)
        fw.write((char) i);

      System.out.println("Writing successful");
      fr.close();
      fw.close();
    }
    try (
        FileWriter fw = new FileWriter("output.txt")) {
      while ((i = fr1.read()) != -1)
        fw.write((char) i);

      System.out.println("Writing successful");
      fr1.close();
      fw.close();
    }

  }
}