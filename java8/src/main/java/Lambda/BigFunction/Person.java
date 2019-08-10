package Lambda.BigFunction;

/**
 * @Author
 * @Date 2019/7/29 12:59
 **/
public class Person {
   private String username;
   private int age;

    public Person(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}
