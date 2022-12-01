import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please insert dividend : ");
            int dividend = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please insert divisor : ");
            int divisor = scanner.nextInt();
            scanner.nextLine();
            if (divisor == 0) {
                throw new Exception("It's not possible to divide by 0, please try again!");
            }
            System.out.println("The product is : " + (dividend /divisor));
        }
    }
}
