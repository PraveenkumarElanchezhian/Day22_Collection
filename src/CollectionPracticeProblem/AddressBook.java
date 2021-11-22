package CollectionPracticeProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	private static ArrayList<AddressBookContact> list = new ArrayList<AddressBookContact>();
    private void editContact() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter firstname to edit contact :: ");
        String name = userInput.nextLine();
        for (AddressBookContact search : list) {
            if (name.equalsIgnoreCase(search.getFirstName())) {
                System.out.println("Entered Name found in the Contacts");
                System.out.println("Enter the updated first name");
                String firstName = userInput.next();
                search.setFirstName(firstName);
                System.out.println("Enter the updated last name");
                String lastName = userInput.next();
                search.setLastName(lastName);
                System.out.println("Enter the updated address");
                String address = userInput.next();
                search.setAddress(address);
                System.out.println("Enter the updated city");
                String city = userInput.next();
                search.setCity(city);
                System.out.println("Enter the updated state");
                String state = userInput.next();
                search.setState(state);
                System.out.println("Enter the updated zipcode");
                int zip = userInput.nextInt();
                search.setZip(zip);
                System.out.println("Enter the updated phoneNumber");
                long phoneNumber = userInput.nextInt();
                search.setPhoneNumber(phoneNumber);
                System.out.println("Enter the updated emailID");
                String email = userInput.next();
                search.setEmail(email);
                search.display();
            } else {
                System.out.println("Entered name not  found in the AddressBook");
            }
        }
    }
   
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
        System.out.println("2. Show Contacts");
        System.out.println("3. Edit Contacts");
        System.out.println("Enter Your Choice");
        int choice = sc.nextInt();
        while (choice >= 1) {
            switch (choice) {
                case 1:
                    Contacts1.AddContactsDetails();
                    break;
                case 2:
                    for (AddressBookContact show : list) {
                        System.out.println(" ");
                        System.out.println("First Name = " + show.getFirstName());
                        System.out.println("Last Name = " + show.getLastName());
                        System.out.println("Address = " + show.getAddress());
                        System.out.println("City Name = " + show.getCity());
                        System.out.println("State = " + show.getState());
                        System.out.println("Zip Code = " + show.getZip());
                        System.out.println("Phone Number = " + show.getPhoneNumber());
                        System.out.println("Email = " + show.getEmail());
                    }
                    break;

                case 3:
                    Contacts1.editContact();
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.println(" ");
            System.out.println("0. Exit");
            System.out.println("1. Add Contacts");
            System.out.println("2. Show Contacts");
            System.out.println("3. Edit Contacts");
            System.out.println("Enter Your Choice");
            choice = sc.nextInt();
        }
    }
}
