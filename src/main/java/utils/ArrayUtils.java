package utils;
import java.util.Scanner;
public class ArrayUtils {         /**
 * Counts the elements in an array that are greater than a specified value.
 *
 * @param nums the integer array to search
 * @param value the number each element is compared against
 * @return the number of elements greater than the specified value
 */
public static int countGreater(int[] nums, int value) {
    int total = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > value) {
            total++;
        }
    }

    return total;
}           /**
 * Finds the most frequently occurring integer in an array.
 *
 * @param nums the integer array to search
 * @return the most frequent integer, or 0 if the array is empty;
 *         if multiple integers share the highest frequency, returns
 *         the first one encountered with that frequency
 */   public static int getMostFrequent(int[] nums) {
    if (nums.length == 0) {
        return 0;
    }

    int mostFrequent = nums[0];
    int highestFrequency = 0;

    for (int i = 0; i < nums.length; i++) {
        int frequency = count(nums, nums[i]);

        if (frequency > highestFrequency) {
            highestFrequency = frequency;
            mostFrequent = nums[i];
        }
    }

    return mostFrequent;
}               /**
 * Finds the most frequently occurring integer in an array.
 *
 * @param nums the integer array to search
 * @return the most frequent integer, or 0 if the array is empty;
 *         if multiple integers share the highest frequency, returns
 *         the first one encountered with that frequency
 */
    public static int count(int[] nums, int value) {
        int counter= 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                counter++;
            }
        }

        return counter;
    }
    /**
 * Finds the String that comes first alphabetically in an array.
 *
 * @param words the String array to search
 * @return the String that comes first alphabetically
 */
    public static String findMin(String[] words) {
        String min = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].compareTo(min) < 0) {
                min = words[i];
            }
        }

        return min;
    }
    /**
 * Finds the lowest integer in an array.
 *
 * @param numbers the integer array to search
 * @return the lowest integer in the array
 */
    public static int findMin(int[] numbers) {
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }
    /**
 * Finds the String that comes last alphabetically in an array.
 *
 * @param words the String array to search
 * @return the String that comes last alphabetically
 */
    public static String findMax(String[] words) {
        String max = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].compareTo(max) > 0) {
                max = words[i];
            }
        }

        return max;
    }
    /**
 * Finds the highest integer in an array.
 *
 * @param numbers the integer array to search
 * @return the highest integer in the array
 */
    public static int findMax(int[] numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }
    /**
 * Calculates the average of the integers in an array.
 *
 * @param numbers the integer array to calculate the average of
 * @return the average of the array's values
 */
public static double calcAverage(int[] numbers) {
    int total = 0;

    for (int i = 0; i < numbers.length; i++) {
        total += numbers[i];
    }

    return (double) total / numbers.length;
}
    /**
     * Displays each integer in an array alongside its position.
     *
     * @param numbers the integer array to display
     */
    public static void displayArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Position " + i + ": " + numbers[i]);
        }
    }

    /**
     * Displays each string in an array alongside its position.
     *
     * @param words the String array to display
     */
    public static void displayArray(String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.println("Position " + i + ": " + words[i]);
        }
    }
}











