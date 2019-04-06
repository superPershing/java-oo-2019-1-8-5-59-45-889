package practice04;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String basicIntroduce() {
        return String.format("My name is Tom. I am %d years old.", getAge());
    }

    public String introduce() {
        return basicIntroduce();
    }

}
