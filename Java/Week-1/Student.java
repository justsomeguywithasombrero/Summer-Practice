public class Student
{
    private String name;
    private int age;
    private String course;
    public Student(String name, int age, String course)
    {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    //Getters
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getCourse()
    {
        return this.course;
    }

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setCourse(String course)
    {
        this.course = course;
    }
    public void displayInfo()
    {
        System.out.println("Student Name: "+this.name);
        System.out.println("Student Age: "+this.age);
        System.out.println("Student Course: "+this.course);
    }
}