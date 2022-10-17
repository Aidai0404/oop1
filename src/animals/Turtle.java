package animals;

public class Turtle extends Animals {
    private String name;
     public Turtle(){}
    public Turtle(String name) {
        this.name = name;
    }

    @Override
    public void animals() {
        System.out.println("A turtle is an animal");
    }
    public void swim(){
        System.out.println("Turtle swims");
    }

    @Override
    public String toString() {
        return  "Turtle's name " +name;
    }
}
