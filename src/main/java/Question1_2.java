
import java.util.Scanner;
public class Question1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int first = input.nextInt();

        System.out.println("Enter the second number:");
        int second = input.nextInt();

        int sum = 0;

        for (int i = first; i <= second; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum);

        input.close();
    }
}


