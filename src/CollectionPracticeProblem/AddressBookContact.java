package CollectionPracticeProblem;

public class AddressBookContact {
	private String firstName = " ";
    private String lastName = " ";
    private String address = " ";
    private String city = " ";
    private String state = " ";
    private int zip = 0;
    private long phoneNumber = 0;
    private String email = " ";

    public AddressBookContact(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber,String email ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /*
     *This Display Method Displays Details Just Got Added To The Array List.
     */

    public void display() {
        System.out.println(" ");
        System.out.println("First Name = "+firstName);
        System.out.println("Last Name = "+lastName);
        System.out.println("Email = "+email);
        System.out.println("Address = "+address);
        System.out.println("City Name = "+city);
        System.out.println("Zip Code = "+zip);
        System.out.println("Phone Number = "+phoneNumber);
    }
}
