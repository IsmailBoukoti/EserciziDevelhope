public class Number {

    double score ;

    public void checkScore(double score) throws Exception {
        if (0 < score && score<= 50.00) {
            System.out.println("Average score");
        } else if (50.00 < score && score<= 100.00) {
            System.out.println("Very good score");
        } else {
            throw new ArithmeticException("Score is out of scale!");
        }
    }
}
