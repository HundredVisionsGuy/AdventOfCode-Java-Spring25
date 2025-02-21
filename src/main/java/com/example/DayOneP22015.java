package com.example;

import java.util.ArrayList;

public class DayOneP22015 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<String> inputs;
        inputs = ReadFile.getInput("src/main/resources/day1_test.txt");
        if (inputs.size() > 0) {
            for (int i=0; i<inputs.size(); i++) {
                String plan = inputs.get(i);
                int floor = 0;
                // FOR DAY 2: SET a counter variable to 0
                int counter = 0;

                // Foreach loop
                for (char c : plan.toCharArray()) {
                    if (c == '(') {
                        floor++;
                    }
                    else {
                        floor--;
                    }

                    counter++;

                    // Return position IF floor == -1
                    System.out.println("Counter is now " + counter);
                    // Increment counter
                }
                System.out.println("We landed on floor #" + floor);
            }
        }
        else {
            System.out.println("Ooops!");
        }
    }
}
