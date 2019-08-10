package Lambda.Optional;

/**
 * @Author
 * @Date 2019/7/30 9:13
 **/
public class Employee {
    private String name;
    private int age;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
