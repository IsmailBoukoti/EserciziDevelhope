import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a command : ");
            String input = scanner.nextLine();
            System.out.println("The entered command is : " + input);
            if(input.equals("stop")) break;
        }
    }
}
