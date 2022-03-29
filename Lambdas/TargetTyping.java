package Lambdas;

interface Addition
{
    public void findSum(int num1,int num2);
}

public class TargetTyping {

    public static void main(String[] args) {

        Addition addition = (num1,num2)-> System.out.println("Sum of two numbers :"+(num1+num2));
        addition.findSum(10,20);
    }

}
