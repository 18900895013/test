package Lambda.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author
 * @Date 2019/7/31 9:02
 **/
public class StreamTest07 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hi","Hello","nihao");
        List<String> list2 = Arrays.asList("zhangsan","lisi","wangwu","zhaoliu");
       list1.stream().flatMap(item -> list2.stream().map(item2 -> item + " " + item2)).forEach(System.out::println);



    }
}
