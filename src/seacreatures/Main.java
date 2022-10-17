package seacreatures;

import person.Dancer;

public class Main {
    public static void main(String[] args) {
  Shark shark1=new Shark("Donya","indian ocean");
    Shark shark2=new Shark("Dony","pacific ocean");
        Shark  shark3=new Shark("Masya"," mediterranean ocean");
        Shark shark4=new Shark("Zipcy","yellow ocean");
        Shark shark5=new Shark("Lana","pacific ocean");

      Turtle turtle1=new Turtle("Kung-fu",105);
        Turtle  turtle2=new Turtle("Kunu",100);

        Turtle turtle3=new Turtle("Zui",10);
        Turtle  turtle4=new Turtle("Shui",99);
        Turtle turtle5=new Turtle("Lui",15);

       Duckbill duckbill1=new Duckbill("Perry","brown");
        Duckbill  duckbill2=new Duckbill("Harry","red");
        Duckbill  duckbill3=new Duckbill("Nana","orange");
        Duckbill  duckbill4=new Duckbill("Sanyok","black");
        Duckbill duckbill5=new Duckbill("Manyok","brown");

        Seacreatures[] seacreatures={shark1,shark2,shark3,shark4,shark5,turtle1,turtle2,turtle3,turtle4,turtle5,duckbill1,duckbill2,duckbill2
        ,duckbill3,duckbill4,duckbill5};
//        for(Seacreatures sea:seacreatures){
//            System.out.println(sea);
//            sea.swim();
//        }
        for(Seacreatures seacreatures1:seacreatures){
            if(seacreatures1.getClass().getName().equals("seacreatures.Shark")){
                ((Shark)seacreatures1).attack();
            }
            else if(seacreatures1.getClass().getName().equals("seacreatures.Duckbill")){
                ((Duckbill)seacreatures1).layEgg();
            }
            else{
                ((Turtle)seacreatures1).swim();
            }
        }

        }




        }





