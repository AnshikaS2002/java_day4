package AddressBookSystem;

import java.util.Scanner;

public class AddressBookSystem {
    AddressBookMethods addressBookMethods = new AddressBookMethods();

    public void addAddressBook() {

        while (true) {
            System.out.println("Enter 1 add, 2 to edit, 3 to delete, 4 to print details, 5 to exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addressBookMethods.addDetails();
                    break;

                case 2:
                    addressBookMethods.editDetails();
                    break;

                case 3:
                    addressBookMethods.deleteContact();
                    break;

                case 4:
                    addressBookMethods.printAddressBook();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public void printAddressBooks() {
        addressBookMethods.printAddressBook();
    }
}
