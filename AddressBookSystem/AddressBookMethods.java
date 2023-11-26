package AddressBookSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMethods {
    static Map<String, AddressBook> dataMap = new HashMap<String, AddressBook>();

    public void addDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first name: ");
        String firstName = scanner.hasNextLine() ? scanner.nextLine() : "";

        System.out.println("Please enter the last name: ");
        String lastName = scanner.hasNextLine() ? scanner.nextLine() : "";

        System.out.println("Please enter the address: ");
        String address = scanner.hasNextLine() ? scanner.nextLine() : "";

        System.out.println("Please enter the city: ");
        String city = scanner.hasNextLine() ? scanner.nextLine() : "";

        System.out.println("Please enter the state: ");
        String state = scanner.hasNextLine() ? scanner.nextLine() : "";

        System.out.println("Please enter the zip code: ");
        String zipCode = scanner.hasNextLine() ? scanner.nextLine() : "";

        System.out.println("Please enter the phone number: ");
        String phoneNumber = scanner.hasNextLine() ? scanner.nextLine() : "";

        System.out.println("Please enter the email: ");
        String email = scanner.hasNextLine() ? scanner.nextLine() : "";

        AddressBook addressBook = new AddressBook(firstName, lastName, address, city, state, zipCode, phoneNumber,
                email);
        dataMap.put(firstName, addressBook);
    }

    void editDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first name");
        String firstName = scanner.hasNextLine() ? scanner.nextLine() : "";
        if (dataMap.containsKey(firstName)) {
            System.out.println("--------Editing details-------");
            dataMap.remove(firstName);
            addDetails();
        } else
            System.out.println("No user exists with this name");
    }

    void deleteContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the contact's first name: ");
        String firstName = scanner.hasNextLine() ? scanner.nextLine() : "";

        if (dataMap.containsKey(firstName)) {
            dataMap.remove(firstName);
        } else
            System.out.println("No user exists with this name");
    }

    void printAddressBook() {
        for (Map.Entry<String, AddressBook> entry : dataMap.entrySet()) {
            AddressBook contact = entry.getValue();
            System.out.println("First name : " + entry.getKey());
            System.out.println("Last Name : " + contact.lastName);
            System.out.println("Address : " + contact.address);
            System.out.println("City : " + contact.city);
            System.out.println("State : " + contact.state);
            System.out.println("Zip Code : " + contact.zip);
            System.out.println("Phone Number : " + contact.phoneNumber);
            System.out.println("Email : " + contact.email);
        }
    }
}
