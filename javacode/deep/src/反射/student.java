package 反射;

import java.util.Objects;

public class student {
    private String name;
    private int age;
    private String sex;
    public static String ID;
    public static final String contry="China";

    public student() {}
    public void run(){
        System.out.println("fast");
    }
    public void eat(){
        System.out.println("good");
    }
    private String eat(String name){
        System.out.println(name);
        return "The "+name+" is good";
    }
    public static void happy(){
        System.out.println("HAPPY");
    }

    public student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String  getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(sex, student.sex);
    }

}
