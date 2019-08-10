package Lambda.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author
 * @Date 2019/7/30 15:13
 **/
public class StreamTest05 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","world","hello world");
        List<String> list = stream.collect(Collectors.toList());
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        List<Integer> list1 = stream1.collect(Collectors.toCollection(ArrayList::new));
        List<Integer> collect = list1.stream().map(i -> i * i).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
