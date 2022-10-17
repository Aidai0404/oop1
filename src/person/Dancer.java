package person;

public class Dancer extends Person {
   private String name;

    public Dancer(String name) {
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
        return "Dancer: " + name;
    }
    @Override
    public void walk() {
        System.out.println(name+ " is walking");
    }
}
