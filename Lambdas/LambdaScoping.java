package Lambdas;

interface TestInterface{
   int calculate(int i,int j);
}

class SuperScoping
{
    public void showValue(String str)
    {
        System.out.println("String is "+str);
    }
}

public class LambdaScoping extends SuperScoping{

    public static void main(String[] args) {

        LambdaScoping scope = new LambdaScoping();
        scope.result();
    }
    public  void  result()
    {
        TestInterface testInterface = (x,y)->
        {
            System.out.println("string "+this.toString());
            super.showValue("calling from lambda");
            return x+y;
        };
        System.out.println("Result is "+testInterface.calculate(10,20));
    }

}
