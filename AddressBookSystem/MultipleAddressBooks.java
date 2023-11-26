import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import AddressBookSystem.AddressBook;
import AddressBookSystem.AddressBookSystem;

public class MultipleAddressBooks {
    public static void main(String[] args) {
        System.out.println("Add count of address book");
        HashMap<String, AddressBookSystem> bookMap = new HashMap<String, AddressBookSystem>();

        Scanner scanner = new Scanner(System.in);
        int addressBookCnt = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < addressBookCnt; i++) {
            System.out.print("Enter address book name : ");
            String addressBookName = scanner.nextLine();
            if (!bookMap.containsKey(addressBookName)) {
                AddressBookSystem addressBookSystem = new AddressBookSystem();
                addressBookSystem.addAddressBook();
                bookMap.put(addressBookName, addressBookSystem);
            } else {
                System.out.println("Already exist this address book.");
            }

        }

        System.out.println("complete data");
        for (Map.Entry<String, AddressBookSystem> entry : bookMap.entrySet()) {
            System.out.println("AddressBook Name : " + entry.getKey());
            AddressBookSystem addressBookSystem = entry.getValue();
            addressBookSystem.printAddressBooks();
        }
    }
}
