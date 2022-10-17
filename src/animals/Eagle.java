package animals;

public class Eagle extends Animals {
    private String name;
    public Eagle(){}

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public void animals() {
        System.out.println("An eagle  is an animal");
    }
   public void fly(){
       System.out.println("Eagle flies");
   }

    @Override
    public String toString() {
        return "Eagle's name " +name;
    }
}
