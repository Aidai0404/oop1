package seacreatures;

public class Shark extends Seacreatures{
   private String name;
   private String habitat;

    public Shark(String name, String habitat) {
        this.name = name;
        this.habitat=habitat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public void attack(){
        System.out.println(name+" attacks");
    }

    @Override
    public void swim() {
        System.out.println(name+" swims");
    }

    @Override
    public String toString() {
        return "Shark{" +
                "name='" + name + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
