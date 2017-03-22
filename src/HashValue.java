/**
 * Created by YSingh on 22/03/17.
 */

class Person {
    int salary;
    int age;
    String name;

    public Person(int salary, int age, String name) {
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (salary != person.salary) return false;
        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = salary;
        result = 31 * result + age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

public class HashValue {
    public static void main(String[] args) {
        Person a = new Person(123, 10, "Yogesh");
        Person b = new Person(123, 10, "Yogesh");
        System.out.println(a.equals(b));
    }
}
