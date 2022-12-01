package it.develhope;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert name : ");
        person.setName(scanner.nextLine());
        System.out.println("Please insert surname : ");
        person.setSurname(scanner.nextLine());
        System.out.println("Please insert height : ");
        person.setHeight(scanner.nextDouble());
        System.out.println("Please insert age : ");
        person.setAge(scanner.nextInt());

        System.out.printf("%s %s , height : %.2f , age : %d", person.getName(),person.getSurname(),
                person.getHeight(), person.getAge());
    }
}
