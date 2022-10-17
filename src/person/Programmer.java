package person;

public class Programmer extends Person{
   private String name;

    public Programmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Programmer: " + name;
    }
    @Override
    public void walk() {
        System.out.println(name+ " is walking");
    }
}
