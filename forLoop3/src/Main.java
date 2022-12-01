import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] arr = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for (int i = 0; i < arr.length; i+=2) {
           arr[i] = arr[i].toUpperCase();
        }
        System.out.println(Arrays.toString(arr));
    }
}
