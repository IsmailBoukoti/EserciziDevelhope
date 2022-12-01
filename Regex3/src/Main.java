public class Main {
    public static void main(String[] args) {
        String myString = "are you able to climb, are you able to swim or are you able to fly?";
        System.out.println(myString.replaceAll("[\s]are", "_XYZ"));

        String myString2 = "x3z ? xYz ! R1 && __";
        System.out.println(myString2.replaceAll("[a-z]|[0-9]+",  "*"));
    }
}
