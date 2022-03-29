package Streams;

import java.util.stream.*;
import java.util.*;

public class Stats{
    public static void main (String[] args) {
        double dataset[] = {32, 23, 54, 15.2, 26.3, 7.1, 18.7, 14.2, 23,
                25, 21.7, 12.4, 21, 24, 42, 55, 23, 14.5, 21.3, 26.3, 53, 23,
                15.2, 7.1, 15.4, 23, 15.2, 14.2, 14.2, 25, 18.7, 15.2, 14.5};

        DoubleSummaryStatistics stats =
                DoubleStream.of(dataset).summaryStatistics();

        System.out.println ("The count is : "+stats.getCount());

        System.out.println ("The sum is :"+stats.getSum());

        System.out.println ("The average is : "+stats.getAverage());

        System.out.println ("The maximum is : "+stats.getMax());

        System.out.println ("The minimum is : "+ stats.getMin());
    }
}