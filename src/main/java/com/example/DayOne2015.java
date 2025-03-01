package com.example;

import java.util.ArrayList;

public class DayOne2015 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<String> inputs;
        inputs = ReadFile.getInput("src/main/resources/day1.txt");
        if (inputs.size() > 0) {
            // traditional for loop
            for (int i=0; i<inputs.size(); i++) {
                String plan = inputs.get(i);
                int floor = 0;

                // Foreach loop
                for (char c : plan.toCharArray()) {
                    if (c == '(') {
                        floor++;
                    }
                    else {
                        floor--;
                    }
                }
                System.out.println("We landed on floor #" + floor);
                System.out.println("We first stepped into the basement at flight #");
            }
        }
        else {
            System.out.println("Ooops!");
        }
    }
    public static int getPart2(String relativePath) {
        int result = 0;
        System.out.println("Run your algorithm for part 2");
        return result;
    }
}
