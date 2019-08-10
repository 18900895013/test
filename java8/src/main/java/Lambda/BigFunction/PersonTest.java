package Lambda.BigFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @Author
 * @Date 2019/7/29 13:06
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("zhangsan",20);
        Person p2 = new Person("lisi",30);
        Person p3 = new Person("wangwu",40);
        List<Person> personList = Arrays.asList(p1,p2,p3);
        List<Person> p = getPersonByUsername("zhangsan",personList);
          p.forEach(item-> System.out.println(item.getUsername()));

          List<Person> a = getPersonByAge(20,personList);
          a.forEach(item-> System.out.println(item));
    }
    public static List<Person> getPersonByUsername(String username,List<Person> list){
     return list.stream().filter(person->person.getUsername().equals(username)).collect(Collectors.toList());
    }
    public static List<Person> getPersonByAge(int age,List<Person> list){
        BiFunction<Integer,List<Person>,List<Person>> biFunction = (ageofPerson,personList)->
            personList.stream().filter(person -> person.getAge() > ageofPerson).collect(Collectors.toList());

        return biFunction.apply(age,list);
    }
}
