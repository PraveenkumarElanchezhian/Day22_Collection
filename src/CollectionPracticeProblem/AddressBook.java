package CollectionPracticeProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	private static ArrayList<AddressBookContact> list = new ArrayList<AddressBookContact>();
	
    public void AddContactsDetails() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("First Name :: ");
        String firstName = userInput.nextLine();
        System.out.println("Last Name :: ");
        String lastName = userInput.nextLine();
        System.out.println("Address :: ");
        String address = userInput.nextLine();
        System.out.println("City :: ");
        String city = userInput.nextLine();
        System.out.println("State :: ");
        String state = userInput.nextLine();
        System.out.println("Zip Code :: ");
        int zip = userInput.nextInt();
        System.out.println("Phone Number :: ");
        long phoneNumber = userInput.nextLong();
        System.out.println("Email :: ");
        String email = userInput.nextLine();
        AddressBookContact person = new AddressBookContact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        list.add(person);
        person.display();
        System.out.println(list);
    }

    public static void main(String[] args) {
        AddressBook Contacts1 = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("0. Exit");
        System.out.println("1. Add Contacts");
        System.out.println("Enter Your Choice");
        int choice = sc.nextInt();
        while (choice >= 1) {
            switch (choice) {
                case 1:
                    Contacts1.AddContactsDetails();
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.println(" ");
            System.out.println("0. Exit");
            System.out.println("1. Add Contacts");
            System.out.println("Enter Your Choice");
            choice = sc.nextInt();
        }
        System.out.println("The Program End");
    }
}
