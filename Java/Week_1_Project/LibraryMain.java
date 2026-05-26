import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class LibraryMain
{
    public int Menu(Scanner scan)
    {
        System.out.println("1.Search by title");
        System.out.println("2.Borrow");
        System.out.println("3.Return");
        System.out.println("4.Add book");
        System.out.println("5.Display All");
        System.out.println("6.Remove a specific book");
        System.out.println("7.Exit");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        return choice;
    }

    public static void main(String [] args)
    {
        LibraryMain libMain = new LibraryMain();
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> catalogue = new ArrayList<Book>();
        Librarian librarian = new Librarian("Perry", "L001");
        Member member = new Member("Katie", "M001");
        boolean found = false;
        int choice = libMain.Menu(scan);
        while(choice != 7)
        {
            switch(choice)
            {
                case 1: //Clear the input buffer just in case removes the risk of junk messing with input - Sombrero
                        scan.nextLine();
                        System.out.print("Enter the title of the book you wish to find: ");
                        String searchTitle = scan.nextLine();
                        for(Book searchBook:catalogue)
                        {
                            if(searchBook.getTitle().toLowerCase().equals(searchTitle.toLowerCase()))
                            {
                                found = true;
                                System.out.println("The book titled "+searchTitle+" has been found within the catalogue");
                                System.out.println("Title: "+ searchBook.getTitle());
                                System.out.println("Author: "+ searchBook.getAuthor());
                                System.out.println("ISBN: "+ searchBook.getISBN());
                                System.out.println("IsAvailable ?: "+ searchBook.getIsAvailable());
                                break;
                            }
                            
                        }
                        if(!found)
                        {
                            System.out.println("There is currently no book with a matching title in our catalogue");
                        }
                        break;

                case 2: scan.nextLine();
                        System.out.print("Enter the title of the book you wish to borrow: ");
                        String bTitle = scan.nextLine();
                        for(Book Bbook: catalogue)
                        {
                            if(Bbook.getTitle().toLowerCase().equals(bTitle.toLowerCase()) && Bbook.getIsAvailable() == true)
                            {
                                Bbook.setIsAvailable(false);
                                System.out.println("The book was borrowed successfully !");
                                break;
                            }
                        }
                    
                        break;
                case 3: scan.nextLine();
                        System.out.print("Enter the title of the book you wish to return: ");
                        String rTitle = scan.nextLine();
                        for(Book Sbook: catalogue)
                        {
                            if(Sbook.getTitle().toLowerCase().equals(rTitle.toLowerCase()) && Sbook.getIsAvailable() == false)
                            {
                                Sbook.setIsAvailable(true);
                            }
                        }
                        
                        break;
                case 4: //Clear the input buffer just in case removes the risk of junk messing with input - Sombrero
                        scan.nextLine();
                        System.out.print("Enter the title of the book: ");
                        String title = scan.nextLine();
                        System.out.print("Enter the author's name: ");
                        String author = scan.nextLine();
                        System.out.print("Enter the book's ISBN: ");
                        String ISBN = scan.nextLine();
                        Book book = librarian.addBook(title, author, ISBN);
                        catalogue.add(book);
                        break;
                case 5: for(Book displayBook:catalogue)
                        {
                            System.out.println("Title: "+ displayBook.getTitle());
                            System.out.println("Author: "+ displayBook.getAuthor());
                            System.out.println("ISBN: "+ displayBook.getISBN());
                            System.out.println("IsAvailable ?: "+ displayBook.getIsAvailable());
                        }
                        break;

                case 6: scan.nextLine();
                        System.out.print("Enter the title of the book you wish to remove: ");
                        String target = scan.nextLine();
                        catalogue = librarian.removeBook(catalogue,target);
                        break;
                        

                default: System.out.println("Something Unknow has occurred");
                         break;
            }

           choice = libMain.Menu(scan);
        }


        try
        {
            File file = new File("LibraryLog.txt");
            FileWriter fileWriter = new FileWriter(file);
            for(Book books: catalogue)
            {
                fileWriter.write("Title: "+books.getTitle()+"\n"+"Author: "+books.getAuthor()+"\n"+"ISBN: "+books.getISBN()+"\n"+"Is Available: "+books.getIsAvailable()+"\n\n");
            }
            fileWriter.flush();
            fileWriter.close();
            
        }
        catch(IOException e)
        {

        }

    }
}
