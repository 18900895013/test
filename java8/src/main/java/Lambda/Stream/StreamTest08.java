package Lambda.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author
 * @Date 2019/7/31 9:48
 **/
class Student{
    private String name;
    private int score;
    private int age;

    public Student(String name, int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class StreamTest08 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",100,20);
        Student s2 = new Student("lisi",150,30);
        Student s3 = new Student("zhangsan",120,50);
        Student s4 = new Student("zhangsan",120,60);
        Student s6 = new Student("zhangsan",100,70);
        /**分拣存储**/
        List<Student> studentList = Arrays.asList(s1,s2,s3,s4,s6);
        Map<String, List<Student>> stringListMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::getName));
        System.out.println(stringListMap);

        Map<String, Map<Integer, List<Student>>> collect = studentList.stream().
                collect(Collectors.groupingBy(Student::getName, Collectors.groupingBy(Student::getScore)));
    //分区：只能分两个组，例如大于等于120的为一组小于的为另一组
        Map<Boolean, List<Student>> collect1 = studentList.stream()
                .collect(Collectors.partitioningBy(student -> student.getScore() >= 120));
        System.out.println(collect1);
    }
}
