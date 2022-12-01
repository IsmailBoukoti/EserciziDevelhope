import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("I am in loop");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {}
        }
    }
}
