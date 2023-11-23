import java.util.Scanner;

public class AddressBookSystem {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    long phoneNumber;
    String email;

    public void addContacts(String firstName, String lastName, String address, String city, String state, int zip,
            long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first name:");
        String firstName = scanner.nextLine();

        System.out.println("Please enter the last name");
        String lastName = scanner.nextLine();

        System.out.println("Please enter the address");
        String address = scanner.nextLine();

        System.out.println("Please enter the city");
        String city = scanner.nextLine();

        System.out.println("Please enter the state");
        String state = scanner.nextLine();

        System.out.println("Please enter the zip code");
        int zip = scanner.nextInt();

        System.out.println("Please enter the phone number");
        long phoneNumber = scanner.nextLong();

        System.out.println("Please enter the email");
        String email = scanner.nextLine();

        AddressBookSystem ads = new AddressBookSystem();
        ads.addContacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
        scanner.close();

    }
}