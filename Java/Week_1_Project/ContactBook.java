import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;


public class ContactBook 
{
    public static void main(String[] args)
    {
        //Object Initialisation
        Scanner scan = new Scanner(System.in);
        ArrayList<Contact> contactList = new ArrayList<Contact>();
        Contact contact = new Contact();

        System.out.print("Enter the name of your new Contact: ");
        String name = scan.nextLine();
        System.out.print("Enter the number of your new Contact: ");
        String number = scan.nextLine();

        //Populating the  object
        contact.setName(name);
        contact.setNumber(number);

        //Populating the arrayList
        contactList.add(contact);

        

    }
}
