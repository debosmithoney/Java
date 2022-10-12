import java.io.*;
import java.util.*;

public class test {
  public static void main(String[] args) throws IOException {
    writeFile("Chacha Vidyayak", "Cheeeems");
    // readScanner();
    deleteFile("Study/ano.txt");
  }

  public static void createFile() throws IOException {
    File file = new File("StudyEasy.txt");
    file.createNewFile(); // Creeating File
    System.out.println("File created: " + file.getName());
  }

  public static void createDirectory() throws IOException {
    File dir = new File("StudyEasy");
    dir.mkdir(); // Single Directory Created
    File dir1 = new File("Study/Java");
    dir1.mkdirs(); // Multiple Directory Created
    System.out.println("Directory created: " + dir.getName());
  }

  public static void writeFile(java.lang.String string, java.lang.String string2) throws IOException {
    File file = new File("Study"); // Folder
    file.mkdir(); // Folder Created
    file = new File("Study/team.txt"); // File
    try { // Try-catch
      file.createNewFile(); // Create new file
      System.out.println("New File created: " + file.getName());
    } catch (IOException e) { // IOException thrown
      System.out.println("Error Occured: " + e.getMessage());
    }
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) { // try with resources & True to append
      bw.write(string); // Writing data to file
      bw.newLine(); // Next line
      bw.write(string2);
      System.out.println("Output created:" + file.getName());
      bw.close(); // Closing the writer
    } catch (IOException e) {
      System.out.println("Error Occured: " + e.getMessage());
    }
    try {
      BufferedReader br = new BufferedReader(new FileReader("Study/team.txt")); // File Reader
      System.out.println("#####");
      java.lang.String line;
      while ((line = br.readLine()) != null) { // Checks for String
        System.out.println(line);
      }
      br.close(); // Closing the reader
    } catch (FileNotFoundException e) { // File not found
      System.out.println("Error Occured:" + e.getMessage());
      e.printStackTrace();
    } catch (Exception e) { // Exception
      System.out.println("Error Occured:" + e.getMessage());
      e.printStackTrace();
    }
  };

  public static void readScanner() {
    try {
      Scanner sc = new Scanner(new File("text.txt")); // Scanner to read
      java.lang.String line;
      while (sc.hasNext()) { // Checks next available line
        line = sc.nextLine();
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      System.out.println("Error Occured:" + e.getMessage());
    }
  }

  public static void deleteFile(java.lang.String string) {
    File file = new File(string); // Get file path
    if (file.delete()) // Deletes file and returns boolean value
      System.out.println("File Deleted " + file.getPath());
    else
      System.out.println("Error Occured");
  }
}