
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Map<String, ArrayList<AddressBook>> cityMap = new HashMap<String, ArrayList<AddressBook>>();

    public static void main(String[] args) {
        System.out.println("Menu : ");
        HashMap<String, AddressBookSystem> bookMap = new HashMap<String, AddressBookSystem>();

        while (true) {
            System.out.println("Enter 0 to exit");
            System.out.println("Enter 1 to add a book");
            System.out.println("Enter 2 to print all books");
            System.out.println("Enter 3 to search persons by city");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    return;
                case 1:
                    System.out.print("Enter address book name : ");
                    String addressBookName = scanner.nextLine();
                    if (!bookMap.containsKey(addressBookName)) {
                        AddressBookSystem addressBookSystem = new AddressBookSystem();
                        addressBookSystem.addAddressBook();
                        bookMap.put(addressBookName, addressBookSystem);
                    } else {
                        System.out.println("Already exist this address book.");
                    }
                    break;

                case 2:
                    for (Map.Entry<String, AddressBookSystem> entry : bookMap.entrySet()) {
                        System.out.println("AddressBook Name : " + entry.getKey());
                        AddressBookSystem addressBookSystem = entry.getValue();
                        addressBookSystem.printAddressBooks();
                    }
                    break;

                case 3:
                    System.out.println("Enter city name : ");
                    String city = scanner.next();
                    if (cityMap.containsKey(city)) {
                        for (int i = 0; i < cityMap.get(city).size(); i++) {
                            cityMap.get(city).get(i).printDetails();
                            System.out.println("");
                        }
                    }
                    break;

                default:
                    break;
            }
        }
    }
}
