package com.example;

import java.util.ArrayList;

public class RedNosedReportPart1Day2Year24 {
    public static void main(String[] args) {
        // Get the data and store it as a list of reports.
        ArrayList<String> reports;
        reports = ReadFile.getInput(
            "src/main/resources/twoDArrays/day2_p1.txt");

        int numSafe = 0;
        boolean isSafe;

        // Loop through each report and check to see if it is safe or not.
        for (String report : reports) {
            isSafe = isReportSafe(report);

            // add 1 to number safe if report was safe
            if (isSafe) {
                numSafe++;
            }
        }

        // Output the number of safe reports.
        System.out.println("There are " + numSafe + " safe reports.");
    }
    private static boolean isReportSafe(String report) {
        // assume the report is safe until it breaks the rules
        boolean isSafe = true;

        // convert report into an arraylist of integers
        ArrayList<Integer> levels = getLevels(report);

        // GET first two levels & check to see if they are increasing
        int currentLevel = levels.get(0);
        int nextLevel = levels.get(1);
        int difference = currentLevel - nextLevel;
        boolean isIncreasing = difference < 0;

        for (int i=0; i<levels.size() - 1; i++) {
            currentLevel = levels.get(i);
            nextLevel = levels.get(i + 1);

            if (isIncreasing) {
                // subtract the current item from the next item
                difference = nextLevel - currentLevel;
            }
            else {
                difference = currentLevel - nextLevel;
            }

            // If the difference is NOT between 1 and 3, it's NOT safe
            if (difference < 1 || difference > 3) {
                isSafe = false;
                break;
            }
        }
        return isSafe;
    }
    private static ArrayList<Integer> getLevels(String report) {
        ArrayList<Integer> levels = new ArrayList<>();
        int level;
        String currentNumber = "";

        // loop through the characters in the report
        for (int i = 0; i<report.length(); i++) {
            // if there is a space continue to next number
            char item = report.charAt(i);
            if (Character.isSpaceChar(item)) {
                if (! currentNumber.equals("")) {
                    level = Integer.valueOf(currentNumber);
                    levels.add(level);
                    currentNumber = "";
                }
            }
            else {
                currentNumber += Character.toString(item);
            }
        }

        return levels;
    }
}
