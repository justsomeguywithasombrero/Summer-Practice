public class StudentMain
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Charles",25, "Engineering");
        Student student2 = new Student("Mary",20, "Biology");
        Student student3 = new Student("Peter",23, "Mathematics");
        Student student4 = new Student();

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();

        student4.setName("Christina");
        student4.setAge(22);
        student4.setCourse("Bio-medical Engineering");
        student4.displayInfo();
    }
}
