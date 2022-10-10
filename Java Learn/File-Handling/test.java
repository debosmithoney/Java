import java.io.*;

public class test {
  public static void main(String[] args) throws IOException {
    writeFile("Chacha Vidyayak", "Cheeeems");
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

  public static void writeFile(String data, String data2) throws IOException {
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
      bw.write(data); // Writing data to file
      bw.newLine(); // Next line
      bw.write(data2);
      System.out.println("Output created:" + file.getName());
      bw.close(); // Closing the writer
    } catch (IOException e) {
      System.out.println("Error Occured: " + e.getMessage());
    }
    try {
      BufferedReader br = new BufferedReader(new FileReader("Study/team.txt"));
      String line;
      while ((line = br.readLine()) != null){
        
      }
    } catch (Exception e) {
      // TODO: handle exception
    }
  };
}