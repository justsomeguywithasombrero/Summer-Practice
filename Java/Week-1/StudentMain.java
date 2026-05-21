import java.util.ArrayList;

public class StudentMain
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Charles",25, "Engineering");
        Student student2 = new Student("Mary",20, "Biology");
        Student student3 = new Student("Peter",23, "Mathematics");
        Student student4 = new Student();
        GradStudent gradStudent1 = new GradStudent("Korey",27,"Environmental Science","The impact of greenHouse gasses on rising cases of dementia");
        PartTimeStudent partTimeStudent1 = new PartTimeStudent("Maya",26,"Physics","Tutor");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(gradStudent1);
        students.add(partTimeStudent1);

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
        gradStudent1.displayInfo();
        partTimeStudent1.displayInfo();

        student4.setName("Christina");
        student4.setAge(22);
        student4.setCourse("Bio-medical Engineering");
        student4.displayInfo();

        for(Student student: students)
        {
            student.displayInfo();
        }
    }
}
