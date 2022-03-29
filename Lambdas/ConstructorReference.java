package Lambdas;

interface IStudent
{
    void studentname(String s);
}

class Student
{
    String name;
    Student(String name)
    {
        this.name=name;
        System.out.println("The name of student is : "+name);
    }
}
public class ConstructorReference {

    public static void main(String[] args) {
        IStudent student = Student::new;
        student.studentname("bhavya");
    }


}

