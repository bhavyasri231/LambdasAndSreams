package Lambdas;
import java.lang.Runnable;

public class ExistingInterface {
    public static void main(String[] args) {
        Runnable runnable =()->
                System.out.println("New thread is created using lambda expression");
        new Thread(runnable).start();

    }
}
