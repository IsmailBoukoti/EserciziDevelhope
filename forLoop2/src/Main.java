public class Main {
    public static void main(String[] args) {
        int stop = 10;
        int x = 0;
        int y = 1;


        for (int i = 0; i < stop ; i++) {
            int sequence = x+y;
            x = y;
            y = sequence;
            System.out.println(sequence);
        }
    }
}
