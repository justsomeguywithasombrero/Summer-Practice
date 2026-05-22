public class GradStudent extends Student implements Enrollable
{
    private String thesis;

    public GradStudent(String name, int age,String course,String thesis)
    {
        super(name,age,course);
        this.thesis = thesis;
    }
    @Override//Idk why this is necessary but vs code needed it
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Student Thesis: "+this.thesis);
    }
    //Mutator
    public void setThesis(String thesis)
    {
        this.thesis = thesis;
    }
    //Accessor
    public String getThesis()
    {
        return this.thesis;
    }
    @Override
    public void enroll(String semester)
    {
        System.out.println(super.getName()+" enrolled for "+semester);
    }
}
