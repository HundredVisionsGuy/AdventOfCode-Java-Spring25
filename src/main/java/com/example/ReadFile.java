package com.example;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("src/main/resources/day1_test.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  public static ArrayList<String> getInput(String filePath) {
    ArrayList<String> data = new ArrayList<String>();
    try {
        File myObj = new File(filePath);
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String row = myReader.nextLine();
          data.add(row);
        }
        myReader.close();
      } catch (FileNotFoundException e) {
        data.add(e.toString());
      }
      return data;
  }
}
