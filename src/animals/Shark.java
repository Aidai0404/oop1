package animals;

public class Shark extends Animals {
   private String name;
    public Shark(){}

    public Shark(String name) {
        this.name = name;
    }

    @Override
    public void animals() {
        System.out.println("A shark is an animal");
    }
    public void attack(){
        System.out.println("Shark attacks");
    }

    @Override
    public String toString() {
        return  "Shark's name " +name;
    }
}
