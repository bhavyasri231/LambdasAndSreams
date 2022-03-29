package Streams;

import java.util.stream.Stream;

public class CreatingStream {

    private void testEmptyStream()
    {
        Stream<Integer> intstream = Stream.empty();
        System.out.println("Empty Stream:"+intstream.count());

    }

    public static void main(String[] args) {

        new CreatingStream().testEmptyStream();
    }


}
