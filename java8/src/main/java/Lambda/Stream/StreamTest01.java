package Lambda.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author
 * @Date 2019/7/30 10:38
 **/
public class StreamTest01 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","world","hello world");

        args = new String[]{"hello","world","hello world"};
        Stream<String> stream1 = Arrays.stream(args);

        List<String> list = Arrays.asList("hello","world","hello world");
        Stream<String> stream2 = list.stream();
    }
}
