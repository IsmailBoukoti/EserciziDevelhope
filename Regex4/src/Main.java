public class Main {
    public static void main(String[] args) {
        String myString2 = "x3z ? xYz ! R1 && __";
        System.out.println(myString2.replaceAll("[a-z]|[0-9]+",  "*"));
    }
}
