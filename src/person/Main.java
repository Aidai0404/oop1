package person;

public class Main {
    public static void main(String[] args){
        Programmer pro=new Programmer("Aiana");
        Dancer dancer=new Dancer("Ailana");
        Singer sing=new Singer("Naruto");

        Person[] people={pro,dancer,sing};
        for (Person persons: people){
            System.out.println(persons);
            persons.walk();
        }
    }
    // главное,что программист,танцор и певец являются потомками animals.animals
}
