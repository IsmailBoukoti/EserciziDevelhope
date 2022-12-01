public class Main {
    public static void main(String[] args) {

        String mySurname = "Boukoti";

        String checker = mySurname.contains("ni") ? "contains" : "doesn't contain";

        System.out.println("Your surname " + checker + " the sequence of letters 'ni' ");
    }
}
