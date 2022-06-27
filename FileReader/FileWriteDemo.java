package FileReader;

import java.io.*;

public class FileWriteDemo {
  public static void main(String[] args) throws IOException {
    File file = new File("/Users/debosmitchoudhury/Desktop/Projects/Java/FileReader/file.txt");
    FileInputStream fis = null;
    FileOutputStream fout = null;
    try {
      fis = new FileInputStream(file);
      fout = new FileOutputStream("/Users/debosmitchoudhury/Desktop/Projects/Java/FileReader/file1.txt");
      int content;
      while ((content = fis.read()) != -1) {
        fout.write(content);
      }
      System.out.println("File Copied Successfully!");
    } catch (IOException e) {
      e.printStackTrace();
    }
    fis.close();
    fout.close();

  }
}
