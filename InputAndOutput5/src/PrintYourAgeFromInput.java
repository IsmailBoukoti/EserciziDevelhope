import java.util.Scanner;

public class PrintYourAgeFromInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = input.nextInt();
        input.close();Guardate come mostra le differenze facendo add
        System.out.printf("Your age is %d", age);

    }
}
