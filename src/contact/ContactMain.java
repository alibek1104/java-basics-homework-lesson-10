package contact;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactMain {

    private Map<String, Contacts> contactsMap = new HashMap<>();
    public static void main(String[] args) {
        ContactMain contactMain = new ContactMain();
        boolean close = false;
        contactMain.screenText();


        while (!close) {
            Scanner scanner = new Scanner(System.in);

            int num = scanner.nextInt();

            switch (num) {
                case 1 -> contactMain.createContact();
                case 2 -> contactMain.updateContact();
                case 3 -> contactMain.deleteContact();
                case 4 -> contactMain.getAllContacts();
                case 5 -> close = true;
            }
        }
    }



    private void createContact() {
        Scanner scannerCreateContact = new Scanner(System.in);
        Contacts contacts = new Contacts();
        System.out.println("Enter name");
        contacts.setName(scannerCreateContact.nextLine());
        scannerCreateContact = new Scanner(System.in);
        System.out.println("Enter number");
        contacts.setNumber(scannerCreateContact.nextLine());
        scannerCreateContact = new Scanner(System.in);
        System.out.println("Enter email");
        contacts.setEmail(scannerCreateContact.nextLine());
        contactsMap.put(contacts.getNumber(), contacts);
        System.out.println("Contact successfully added");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        screenText();
    }
    private void getAllContacts() {
        for (Map.Entry<String, Contacts> c: contactsMap.entrySet()) {
            System.out.println("Number: " + c.getKey() + "; name: " + c.getValue().getName());
        }
        screenText();
    }
    private void updateContact() {
        Scanner scannerCreateContact = new Scanner(System.in);
        System.out.println("Enter number to change");
        String num = scannerCreateContact.nextLine();
        Contacts contacts = contactsMap.get(num);



        System.out.println("Enter name");
        contacts.setName(scannerCreateContact.nextLine());
        scannerCreateContact = new Scanner(System.in);
        System.out.println("Enter number");
        contacts.setNumber(scannerCreateContact.nextLine());
        scannerCreateContact = new Scanner(System.in);
        System.out.println("Enter email");
        contacts.setEmail(scannerCreateContact.nextLine());
        contactsMap.put(contacts.getNumber(), contacts);
        System.out.println("Contact successfully added");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        screenText();
    }

    private void deleteContact() {

    }

    public void screenText() {
        System.out.println("Press 1 for create the contact");
        System.out.println("Press 2 for update the contact");
        System.out.println("Press 3 for delete the contact");
        System.out.println("Press 4 for get all the contacts");
        System.out.println("Press 5 for close");
    }
}
