import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class StudentMain
{
    public int Menu(Scanner scan)
    {
        int choice;
        System.out.println("1.Add student");
        System.out.println("2.Display all");
        System.out.println("3.Remove by name");
        System.out.println("4.Enroll a grad student");
        System.out.println("5.Exit");
        System.out.println("Enter a chocie: ");
        choice = scan.nextInt();
        return choice;
        
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        StudentMain studmain = new StudentMain();      
     
        int choice = studmain.Menu(scan);
        while( choice != 5)
        {
            switch(choice)
            {           
                case 1: scan.nextLine();
                        System.out.print("Enter the student's name: ");
                        String name = scan.nextLine();
                        System.out.print("Enter the student's age: ");
                        int age = scan.nextInt();
                        //clears the buffer
                        scan.nextLine();
                        System.out.print("Enter the student's course: ");
                        String course = scan.nextLine();
                        //This line creates the new object
                        RegularStudent student = new RegularStudent(name,age,course);
                        //This line adds it to the array list
                        students.add(student);
                        break;
                case 2: for(Student Student: students)
                        {
                            Student.displayInfo(); 
                        }
                        break;

                case 3: scan.nextLine();
                        //This line assumes zero based indexing had to do this as i used a for each instead of the usual index style
                        int count = 0;
                        System.out.print("Enter the name of the student you wish to remove: ");
                        String target = scan.nextLine();
                        for(Student Student: students)
                        {
                            
                            if(Student.getName().equals(target))
                            {
                                students.remove(count);
                                System.out.println("Student removed successfully !");
                                break;
                            }
                            count++;
                        }
                        break;

                        

                case 4: scan.nextLine();
                        System.out.print("Enter the student's name: ");
                        String gname = scan.nextLine();
                        System.out.print("Enter the student's age: ");
                        int gage = scan.nextInt();
                        //Clears the buffer
                        scan.nextLine();
                        System.out.print("Enter the student's course: ");
                        String gcourse = scan.nextLine();
                        System.out.print("Enter the student's thesis: ");
                        String thesis = scan.nextLine();
                        System.out.print("Enter the student's time of enrollment: ");
                        String semester = scan.nextLine();
                        //This line creates the new object
                        GradStudent gStudent = new GradStudent(gname,gage,gcourse,thesis);
                        gStudent.enroll(semester);
                        //This line adds it to the array list
                        students.add(gStudent);
                        break;
                default: System.out.println("Unknown input");
                         break;
                        

            }

            choice = studmain.Menu(scan);
        }

        try
        {
            File file = new File("StudentLog.txt");
            FileWriter fWriter = new FileWriter(file);
            for(Student stud: students)
            {
                if (stud instanceof RegularStudent) 
                {
                    fWriter.write("Name: "+stud.getName()+"\n"+"Age: "+stud.getAge()+"\n"+"Course: "+stud.getCourse()+"\n\n");
                }
                else if (stud instanceof GradStudent) 
                {
                    fWriter.write("Name: "+stud.getName()+"\n"+"Age: "+stud.getAge()+"\n"+"Course: "+stud.getCourse()+"\n"+"Thesis: "+((GradStudent) stud).getThesis()+"\n\n");
                }
                else if (stud instanceof PartTimeStudent) 
                {
                    fWriter.write("Name: "+stud.getName()+"\n"+"Age: "+stud.getAge()+"\n"+"Course: "+stud.getCourse()+"\n"+"Job Title: "+((PartTimeStudent) stud).getJobTitle()+"\n\n");
                }
                
            }

            fWriter.flush();
            fWriter.close();
            
        }
        catch(IOException e)
        {

        }
    }
}
