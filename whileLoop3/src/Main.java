public class Main {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int sequence = 0;

        int counter = 0;

        while (counter<10){
            counter += 1;
            sequence = num1+num2;
            num1 = num2;
            num2 = sequence;
            System.out.println(sequence);
        }
    }
}
