package Lambdas;

interface  Welcome
{
    public String greetingVisitor(String name);
}
public class Greetings {
    public static void main(String[] args) {

        Welcome welcome = (name)->{ return "Hello "+name;};
        System.out.println(welcome.greetingVisitor("bhavya"));

    }
}
