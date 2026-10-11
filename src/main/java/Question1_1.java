import java.util.Scanner;


public class Question1_1 {





        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int number;
            int sum = 0;
            int count = 0;

            System.out.println("Enter numbers (-1 to stop):");

            number = input.nextInt();

            while (number != -1) {
                sum += number;
                count++;

                number = input.nextInt();
            }

            System.out.println("Sum: " + sum);

            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("Average: " + average);
            } else {
                System.out.println("No numbers entered, so there is no average.");
            }

            input.close();
        }
    }






