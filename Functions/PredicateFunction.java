package Functions;

import java.util.function.Predicate;

public class PredicateFunction {
    public static void main(String[] args) {
        Predicate<Double> lessthan =i->(i<15.0);

        System.out.println(lessthan.test(10.0));
    }
}
