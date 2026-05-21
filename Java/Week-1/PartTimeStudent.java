public class PartTimeStudent extends Student
{
    private String jobTitle;

    public PartTimeStudent(String name,int age,String course,String jobTitle)
    {
        super(name,age,course);
        this.jobTitle = jobTitle;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Student Job Title: "+this.jobTitle);
    }

    //Mutator
    public void setJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }

    //Accessor
    public String getJobTitle()
    {
        return this.jobTitle;
    }
}
