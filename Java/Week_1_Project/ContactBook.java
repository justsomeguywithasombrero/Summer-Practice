import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ContactBook 
{
    public static void main(String[] args)
    {
        //Object Initialisation
        Scanner scan = new Scanner(System.in);
        ArrayList<Contact> contactList = new ArrayList<Contact>();
        

        int choice;
        System.out.print("Enter 0 to exit the loop and 1 to continue: ");
        choice = scan.nextInt();
        //this is as much error handling as im willing to implement for now ill assume anyone using it isnt 3 years old
        while(choice != 0 && choice == 1)
        {
            //flushing that buffer
            scan.nextLine();
        

            System.out.print("Enter the name of your new Contact: ");
            String name = scan.nextLine();
            System.out.print("Enter the number of your new Contact: ");
            String number = scan.nextLine();

            Contact contact = new Contact();

            //Populating the  object
            contact.setName(name);
            contact.setNumber(number);

            //Populating the arrayList
            contactList.add(contact);


            System.out.print("Enter 0 to exit the loop and 1 to continue: ");
            choice = scan.nextInt();
        }

        //I believe this clears/flushes the scanner
        scan.nextLine();

        System.out.print("Do you wish to remove anything before moving forward ?(y/n): ");
        String userInput = scan.nextLine();
        if(userInput.toLowerCase().equals("y"))
        {
            for(int i = 0; i < contactList.size();i++)
            {
                System.out.print("Position: "+ (i+1)+" Name: "+ contactList.get(i).getName()+ " " + "Number: "+contactList.get(i).getNumber()+"\n");
            }
            System.out.print("Enter the position of the contact you wish to delete: ");
            int pos = scan.nextInt();
            contactList.remove(pos);
        }

        else if(userInput.toLowerCase().equals("n"))
        {
            //File logic goes here 
            try
            {
                File fileName = new File("Week_1_Project/ContactList.txt");
                FileWriter fileWriter = new FileWriter("ContactList.txt");
                int index = 0;
                while(index < contactList.size())
                {
                    fileWriter.write("Position: "+ (index+1)+" Name: "+ contactList.get(index).getName()+ " " + "Number: "+contactList.get(index).getNumber()+"\n");
                    index ++;
                }
                fileWriter.flush();
                fileWriter.close();


            }
            catch (IOException e)
            {

            } 
        }

        scan.close();

    }
}
