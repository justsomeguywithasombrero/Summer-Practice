public class Member extends LibraryUser implements Borrowable
{
    public Member(String name,String ID)
    {
        super.setName(name);
        super.setID(ID);
    }
    public void borrowBook(Book book)
    {
       book.setIsAvailable(false);
    }
    public void returnBook(Book book)
    {
        book.setIsAvailable(true);
    }
}
