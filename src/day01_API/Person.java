package day01_API;

public class Person {
    private String Name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        Name = name;
        this.age = age;
    }
    /*
    * 直接打印对象的地址值没有意义， 需要重写Object类的toString方法
    * 打印对象的属性(name, age)
    * */
    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
