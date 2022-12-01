public class Main {
    public static void main(String[] args) {

        Number number = new Number();

        try {
            number.checkScore(2.15);
            number.checkScore(50);
            number.checkScore(95.02);
            number.checkScore(100.01);
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("E: causa");
        }
    }
}
