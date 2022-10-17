package seacreatures;

public class Turtle extends Seacreatures {
    private String name;
    private int age;

    public Turtle(String name,int age) {
        this.name = name;
        this.age=age;
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
public void swims(){
    System.out.println(name+" swims");
}
    @Override
    public void swim() {
        System.out.println(name+" swims");
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
