package Interface;

interface Employee
{
    default void employeeCompany()
    {
        System.out.println("Employees company name is Zemoso");
    }
    static void employeedeptmartment()
    {
        System.out.println("every employee should belongs to only one department");
    }

}
public class DefaultStaticMethods implements Employee{
    public static void main(String[] args) {

        DefaultStaticMethods methodobj = new DefaultStaticMethods();
        methodobj.employeeCompany();
        Employee.employeedeptmartment();

    }
}
