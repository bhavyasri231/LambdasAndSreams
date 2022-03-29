package Functions;

import java.util.function.Consumer;

public class ConsumerFunction {
        static void printMessage(String name){
            System.out.println("Hello "+name);
        }
        static void printValue(int val){
            System.out.println(val);
        }
        public static void main(String[] args) {
            // Referring method to String type Consumer interface
            Consumer<String> consumer1 = ConsumerFunction::printMessage;
            consumer1.accept("bhavya");

            Consumer<Integer> consumer2 = ConsumerFunction::printValue;
            consumer2.accept(12);
        }
    }

