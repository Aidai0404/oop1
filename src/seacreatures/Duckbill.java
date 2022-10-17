package seacreatures;

public class Duckbill extends Seacreatures{
    private String name;
    private String color;

    public Duckbill(String name,String color) {
        this.name = name;
        this.color=color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void layEgg(){
        System.out.println(name+" lays eggs");
    }

    @Override
    public void swim() {
        System.out.println(name+" swims");
    }

    @Override
    public String toString() {
        return "Duckbill{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
