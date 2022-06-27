package FileReader;

import java.io.*;

public class FileReadDemo {
  public static void main(String[] args) throws IOException{
    File file = new File("/Users/debosmitchoudhury/Desktop/Projects/Java/FileReader/file.txt");
    FileInputStream fis = null;
    try {
      fis = new FileInputStream(file);
      System.out.println("Total file Size: " + fis.available());
      int content;
      while ((content = fis.read()) != -1)
        System.out.print((char) content);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try{
        if(fis != null) fis.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }
}
