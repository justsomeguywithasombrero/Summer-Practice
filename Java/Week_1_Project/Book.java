public class Book 
{
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public Book()
    {
        this.title = "Unknown Entry";
        this.author = "John Doe";
        this.ISBN = "000-1-001";
        this.isAvailable = false;
    }
    public Book(String title,String author, String ISBN)
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    //Accessors
    public String getTitle()
    {
        return this.title;
    }
    public String getAuthor()
    {
        return this.author;
    }
    public String getISBN()
    {
        return this.ISBN;
    }
    //get feels redundant here may just change to isAvailable - Sombrero
    public Boolean getIsAvailable()
    {
        return this.isAvailable;
    }

    //Mutators
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }
    //Questionable if this should be user facing at all may need removing  - Sombrero
    public void setIsAvailable(Boolean isAvailable)
    {
        this.isAvailable = isAvailable ;
    }
}
