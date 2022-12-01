public class Main {
    public static void main(String[] args) {

        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String veryLongStringReplaced = veryLongString.replaceAll("um","HUM");

        String[] stringSplit = veryLongString.split("aliquip");

        String sub1 = stringSplit[0];
        String sub2 = stringSplit[1];

        System.out.println(sub1+sub2.trim());
        System.out.println(sub1.contains("est") ^ sub2.contains("est"));
    }
}
