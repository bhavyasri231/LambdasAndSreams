package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasics {

    private void findingLargeNumber(List<Integer> list)
    {
        List<Integer> numbers = list.stream().filter(num->num>100000).collect(Collectors.toList());
        System.out.println("The largest number is : "+numbers);

    }

    public static void main(String[] args) {

        StreamBasics basics = new StreamBasics();
        List<Integer> list = new ArrayList<>(Arrays.asList(10000,367893,3989903,3879));
        basics.findingLargeNumber(list);

    }
}