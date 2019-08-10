package Lambda.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author
 * @Date 2019/7/30 14:31
 **/
public class StreamTest04
{
    public static void main(String[] args) {
//       Stream<String> stream = Stream.of("hello","world","hello world");
//       String[] list = stream.toArray(String[]::new);
//        String[] list1 = stream.toArray(lengt->new String[lengt]);

        Stream<String> stream1 = Stream.of("hello","world","hello world");
//       List<String> list2 = stream1.collect(Collectors.toList());
    //    List<String> list3 = stream1.collect(()->new ArrayList(),(thelist,item)->thelist.add(item),
      //          (thelist1,thelist2)->thelist1.addAll(thelist2));
//        List<String> list4 = stream1.collect(LinkedList::new,LinkedList::add,LinkedList::addAll);
//        list3.forEach(System.out::println);
//
//        List<String> list5 = stream1.collect(Collectors.toCollection(ArrayList::new));
//        Set<String> list6 = stream1.collect(Collectors.toCollection(TreeSet::new));
        String str = stream1.collect(Collectors.joining());
        System.out.println(str);

    }
}
