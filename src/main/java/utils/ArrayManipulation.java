package utils;

import java.util.Scanner;
import utils.ArrayUtils;



public class ArrayManipulation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] grades = new int[10];

        // Ask the user to enter 10 grades
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");

            while (!input.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                input.next();
                System.out.print("Enter grade " + (i + 1) + ": ");
            }

            grades[i] = input.nextInt();
        }

        // Count how many times 70 appears
        int numberOfSeventies = ArrayUtils.count(grades, 70);

        // Display the result
        System.out.println("Number of times 70 appears: "
                + numberOfSeventies);

        input.close();
        int mostFrequent = ArrayUtils.getMostFrequent(grades);
        System.out.println("Most frequent grade: " + mostFrequent);

        double average = ArrayUtils.calcAverage(grades);
        System.out.println("Average grade: " + average);


        int above70 = ArrayUtils.countGreater(grades, 70);
        System.out.println("Number of grades above 70: " + above70);
}
}