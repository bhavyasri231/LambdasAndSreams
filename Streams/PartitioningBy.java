package Streams;

import java.util.Map;
        import java.util.List;
        import java.util.stream.Collectors;
        import java.util.stream.Stream;
public class PartitioningBy {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(25, 50, 75, 100, 125, 150);
        // true for stream element 50
        Map<Boolean, List<Integer>> m = stream.collect(Collectors.partitioningBy(a -> a == 50));
        System.out.println("Stream = "+ m);
    }
}
