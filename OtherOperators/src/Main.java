public class Main {

    public static void main(String[] args) {
        int a = 15;
        a += 5;
        a -= 4;
        int b = a;
        b++;
        System.out.println("Is b an odd number? " + (b % 2 == 0));
        int product = b *= b+1;
        System.out.println("Is the product a multiple of 3? " + (product % 3 == 0));
    }
}
