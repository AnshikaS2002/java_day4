import java.util.*;

public class AddressBookSystem {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    long phoneNumber;
    String email;

    public void addContacts(String firstName) {
        this.firstName = firstName;
        Scanner scanner = new Scanner(System.in);

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
        scanner.nextLine();

        System.out.println("Please enter the phone number");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Please enter the email");
        String email = scanner.nextLine();

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

        Map<String, AddressBookSystem> dataMap = new HashMap<String, AddressBookSystem>();

        while (true) {
            System.out.println("Enter 1 to add, 2 to edit, 3 to delete, 4 to exit");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 4)
                break;
            System.out.println("Please enter the first name:");
            String firstName = scanner.nextLine();

            AddressBookSystem ads = new AddressBookSystem();

            switch (option) {
                case 1:
                    ads.addContacts(firstName);
                    dataMap.put(firstName, ads);
                    break;

                case 2:
                    if (dataMap.containsKey(firstName)) {
                        dataMap.remove(firstName);
                        ads.addContacts(firstName);
                        dataMap.put(firstName, ads);
                    } else
                        System.out.println("No user exists with this name");
                    break;

                case 3:
                    if (dataMap.containsKey(firstName)) {
                        dataMap.remove(firstName);
                    } else {
                        System.out.println("No user exists with this name");
                    }

                default:
                    break;
            }
        }

        for (Map.Entry<String, AddressBookSystem> entry : dataMap.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            AddressBookSystem contact = entry.getValue();
            System.out.println("Details: " + contact.firstName + " " + contact.lastName + ", " +
                    contact.address + ", " + contact.city + ", " + contact.state + ", " +
                    contact.zip + ", " + contact.phoneNumber + ", " + contact.email);
        }
        scanner.close();
    }
}