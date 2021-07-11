package lv.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people do you want to create?: ");
        Person[] persons = new Person[scan.nextInt()];

        for (int i = 0; i < persons.length ; i++) {

            Person person = new Person();
            System.out.print("Enter your first name: ");
            person.setFirstName(scan.next());
            System.out.print("Enter your last name: ");
            person.setLastName(scan.next());
            System.out.print("Enter your age name: ");
            person.setAge(scan.nextInt());

            persons[i] = person; //add this person to the person's array
        }

        System.out.println("The average age is: " +  Average.averageOfValues(persons));

    }
}
