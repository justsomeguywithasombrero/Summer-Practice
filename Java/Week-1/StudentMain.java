public class StudentMain
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Charles",25, "Engineering");
        Student student2 = new Student("Mary",20, "Biology");
        Student student3 = new Student("Peter",23, "Mathematics");

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}
