package animals;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = {new Eagle(), new Shark("Poly"), new Turtle()};

        for (Animals animals2 : animals) {
            if (animals2 instanceof Shark) {
                ((Shark) animals2).attack();
                animals2.animals();
            } else if (animals2 instanceof Eagle) {
                ((Eagle) animals2).fly();
                animals2.animals();
            } else {
                ((Turtle) animals2).swim();
                animals2.animals();
            }
        }

        Shark[] sharks1 = new Shark[1];
        sharks1[0] = new Shark();

        for (Shark shark2 : sharks1 ) {
            if (shark2 instanceof Shark) {
                ((Shark) shark2).attack();
                shark2.animals();

            }
        }
        Turtle [] turtle1=new Turtle[1];
        turtle1[0]=new Turtle();
        for(Turtle turtle2: turtle1){
            if(turtle2 instanceof Turtle)
            ((Turtle)turtle2).swim();
            turtle2.animals();

        }

        Eagle [] eagles=new Eagle[1];
        eagles[0]=new Eagle();
        for(Eagle eagle: eagles){
            if(eagle instanceof Eagle){
                ((Eagle)eagle).fly();
                eagle.animals();
            }
        }
    }
}
