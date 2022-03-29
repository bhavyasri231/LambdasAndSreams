package Interface;

public class FunctionalInterface {
    interface Multiplier
    {
        //functionalinterface
        int multiply(int i,int j);
    }

    public static void main(String[] args) {

        Multiplier multiplier = (x,y)-> {return x*y;};
        System.out.println(multiplier.multiply(10,20));

    }
}
