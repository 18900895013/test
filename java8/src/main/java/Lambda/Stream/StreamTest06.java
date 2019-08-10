package Lambda.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author
 * @Date 2019/7/30 15:48
 **/
public class StreamTest06 {
    public static void main(String[] args) {
       Stream<List<Integer>> stream = Stream.of(Arrays.asList(1),Arrays.asList(2,3),Arrays.asList(4,5,6));
        stream.flatMap(theList->theList.stream()).map(value -> value * value).forEach(System.out::println);

//        System.out.println(Stream.iterate(1, item -> item + 2).limit(6).filter(item -> item > 2)
//                .map(item -> 2 * item).skip(2).limit(2).reduce(0, Integer::sum));
        Stream<Integer> s = Stream.iterate(1, item -> item + 2).limit(6);
        IntSummaryStatistics intSummaryStatistics = s.filter(item -> item > 2)
                .mapToInt(item -> 2 * item).skip(2).limit(2).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getSum());
    }
}
