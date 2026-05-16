public class Contact
{
    private String Name;
    private String Number;
    public Contact()
    {
        Name = "Default";
        Number = "000";
    }

    //Muatators
    public void setName(String newName)
    {
        this.Name = newName;
    }
    public void setNumber(String newNumber)
    {
        this.Number = newNumber;
    }

    //Acessors
    public String getName()
    {
        return this.Name;
    }
    public String getNumber()
    {
        return this.Number;
    }
}