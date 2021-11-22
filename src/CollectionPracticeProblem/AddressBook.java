package CollectionPracticeProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	public static ArrayList contacts = new ArrayList();

    public static void main(String[] args) {
        System.out.println("Welcome to Address book program");

        Scanner userInput = new Scanner(System.in);
        AddressBook contact = new AddressBook();

        System.out.println("Enter Firstname");
        String firstName = userInput.next();

        System.out.println("Enter Lastname");
        String lastName = userInput.next();

        System.out.println("Enter Address");
        String address = userInput.next();

        System.out.println("Enter City");
        String city = userInput.next();

        System.out.println("Enter State");
        String state = userInput.next();

        System.out.println("Enter Zip");
        int zip = userInput.nextInt();

        System.out.println("Enter Phone-Number");
        long phoneNumber = userInput.nextLong();

        System.out.println("Enter Emails");
        String email = userInput.next();
        contact.addContact(firstName, lastName, address, city, state, zip, phoneNumber, email);
    }

    private void addContact(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber, String email) {
        contacts.add(firstName);
        contacts.add(lastName);
        contacts.add(address);
        contacts.add(city);
        contacts.add(state);
        contacts.add(zip);
        contacts.add(phoneNumber);
        contacts.add(email);
        System.out.println("Contact details are " + contacts);
    }

}
