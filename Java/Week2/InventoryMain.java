import java.util.HashMap;
import java.util.Scanner;
public class InventoryMain
{
    public int menu(Scanner scan)
    {
        System.out.println("1.Add Item");
        System.out.println("2.Remove Item");
        System.out.println("3.Search by name");
        System.out.println("4.Display All");
        System.out.println("5.Update Quantity");
        System.out.println("6.Exit");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        return choice;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        HashMap<String,Item> inventory = new HashMap<>();
        InventoryMain inMain = new InventoryMain();

        int choice = inMain.menu(scan);
        while(choice != 6)
        {
            switch(choice)
            {
                case 1: 
            }
        }
    }
}