import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] array1 = new String[]{" I want ", " to learn ", " how to code! "};

        String string1 = array1[0].trim();
        String string2 = array1[1].trim();
        String string3 = array1[2].trim();

        String[] array2 = {string1,string2,string3};

        int statement1 = array2[0].compareTo(array1[0]);
        int statement2 = array2[1].compareToIgnoreCase(array1[1]);
        System.out.println(!(statement1 > statement2));
    }
}
