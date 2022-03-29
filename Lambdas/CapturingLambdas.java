package Lambdas;

interface ITrade
{
    public int function(int n);
}
public class CapturingLambdas {

    public static void main(String[] args) {
        ITrade iTrade = (n)-> {return n*2;};

        System.out.println("After multiplying by 2 is: "+iTrade.function(10));
    }

}
