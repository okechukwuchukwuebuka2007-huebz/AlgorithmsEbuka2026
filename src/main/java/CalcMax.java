
import java.util.Scanner;
public class CalcMax {

    public static void main(String[] args) {
        int num1 = getValidInteger("Please enter an integer:");
        int num2 = getValidInteger("Please enter an integer:");
        int num3 = getValidInteger("Please enter an integer:");

        int highest = findMax(num1, num2, num3);

        System.out.println("The highest number is: " + highest);
    }
    public static int getValidInteger(String prompt) {
        Scanner input = new Scanner(System.in);

        System.out.println(prompt);

        while (!input.hasNextInt()) {
            System.out.println("Inappropriate input. Please enter a number.");
            input.next();
            System.out.println(prompt);
        }

        return input.nextInt();
    }

    public static int findMax(int num1, int num2, int num3) {
        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        return max;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static int getValidInteger(String prompt, int lowerLimit, int upperLimit) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println(prompt);

            if (input.hasNextInt()) {
                int number = input.nextInt();

                if (number >= lowerLimit && number <= upperLimit) {
                    return number;
                } else {
                    System.out.println("Your number is outside the allowable range of "
                            + lowerLimit + " to " + upperLimit + ". Please try again.");
                }
            } else {
                System.out.println("Inappropriate input. Please enter an integer.");
                input.next();
            }
        }
    }
}
