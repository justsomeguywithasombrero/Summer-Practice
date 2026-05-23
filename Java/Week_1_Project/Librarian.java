import java.util.ArrayList;
public class Librarian extends LibraryUser 
{
    public Librarian(String name, String ID)
    {
        super.setName(name);
        super.setID(ID);
    }
    public Book addBook(String title,String author, String ISBN )
    {
         Book book = new Book(title,author,ISBN);
         return book;
    }
    public ArrayList<Book> removeBook(ArrayList<Book> books,String target)
    {   int count = 0;
        for(Book book: books)
        {
            if(target.equals(book.getTitle()))
            {
                books.remove(count);
                return books;
            }
            count++;
        }
        //If this runs target title was not found - Sombrero
        return books;
    }
}
