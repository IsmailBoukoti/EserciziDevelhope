package it.develhope;

public class Main {
    public static void main(String[] args) {
        for (Months month : Months.values()) {
            if (month.toString().endsWith("y")) {
                System.out.println(month + " ends with y");
            } else {
                System.out.println(month + " doesn't end with y");
            }
        }
    }
}

