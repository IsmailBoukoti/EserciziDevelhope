import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        System.out.println("Welcome! ");

        while (true) {
            double randomNumber = Math.floor(Math.random() * (10 - 1 + 1) + 1);
            number = (int)randomNumber;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Try to guess the number : ");
            int input = scanner.nextInt();
            if (input == number) {
                System.out.println("Congratulations! ");
                break;
            }
        }
    }
}
