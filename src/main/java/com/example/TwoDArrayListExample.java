package com.example;

import java.util.ArrayList;

public class TwoDArrayListExample {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> keypad = getKeypad();

        // Get & display the starting point:
        int row = 1;
        int column = 1;
        int startingPoint = keypad.get(row).get(column);
        System.out.println("The starting point is " + startingPoint);
    }
    /*
     * Keypad is like your typical keyboard 10-key pad:
     *     0 1 2
     *   +-------+
     * 0 | 1 2 3 |
     * 1 | 4 5 6 |
     * 2 | 7 8 9 |
     *   +-------+
     */
    public static ArrayList<ArrayList<Integer>> getKeypad() {
      // 2D array list
      ArrayList<ArrayList<Integer>> keypad = new ArrayList<>();
      int rows = 3;
      int number = 1;
      for (int i=0; i<rows; i++) {
        keypad.add(new ArrayList<Integer>());
      }
      // Loop through each row
      for (int row=0; row<3; row++) {
        // loop through each column
        for (int i=0; i<3; i++) {
          // add the number to the keypad
          keypad.get(row).add(number);

          // increase the number by 1
          number++;
        }
      }
      return keypad;
    }
}
