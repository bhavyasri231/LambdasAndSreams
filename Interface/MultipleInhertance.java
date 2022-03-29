package Interface;

interface Student
{
    default void work()
    {
        System.out.println("The student will study");
    }
    public abstract void food();
}
interface Employees
{
   /* default void work()
    {
        System.out.println("The employee will do office work");
    }*/
    //it leads to diamond problem
    public abstract void food();
}

public class MultipleInhertance implements Employees,Student{

    public static void main(String[] args) {
        MultipleInhertance mul = new MultipleInhertance();
        mul.food();
        mul.work();

    }

    @Override
    public void food() {
        System.out.println("Both veg and non-veg");

    }
}
