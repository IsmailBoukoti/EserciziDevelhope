public class Main {
    public static void main(String[] args) {
        String myString = "tup tuup tuuup tuuuup";
        System.out.println(myString.replaceAll("u{2,3}", "x"));
    }
}
