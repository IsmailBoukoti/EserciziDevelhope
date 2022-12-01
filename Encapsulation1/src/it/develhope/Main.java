package it.develhope;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        House house = new House();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert residents names separated by a comma :");
        String[] residentsArray = new String[]{scanner.nextLine()};
        house.setResidentNames(residentsArray);

        System.out.println("Please insert the address : ");
        house.setAddress(scanner.nextLine());

        System.out.println("Please insert number of floors : ");
        house.setFloorsNumber(scanner.nextInt());

        String stringFormat = String.format("Number of floors : %s, Address : %s , residents : %s", house.getFloorsNumber(),
                house.getAddress(), Arrays.toString(house.getResidentNames()));
        System.out.println(stringFormat);
    }
}
