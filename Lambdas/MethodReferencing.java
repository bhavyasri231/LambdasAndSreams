package Lambdas;

interface MessageInfo
{
    public void getMessage();
}
public class MethodReferencing {

    public static void saySomething()
    {
        System.out.println("Hello");
    }
    public void NonStaticMethod()
    {
        System.out.println("Non static method");
    }
    public static void main(String[] args) {
        MessageInfo msg = MethodReferencing::saySomething;
        MessageInfo msg2 = new MethodReferencing()::NonStaticMethod;
        msg.getMessage();
        msg2.getMessage();

    }
}
