package homework6;

import java.time.DayOfWeek;

public class Main {
   public static  void main(String[] args) {
      Family f= new Family();
      Pet cat= new Pet(Species.Cat,"leo",2,45,new String[]{"sleeping","eating"},f);
      System.out.println(cat);
      Human a=new Human("Memmed","Memmedov",30,120,new String[][]{{DayOfWeek.MONDAY.name(),"go to karate",},{DayOfWeek.FRIDAY.name(),"read a book"}});
      System.out.println(a);
      System.gc();

      Human mother= new Human("Meryam","Quliyeva",34);
      Human father= new Human("Ali","Quliyev",35);
      Human child1=new Human("Farid","Quliyev",8);
      Human child2=new Human("Narmin","Quliyeva",5);

      Family fam=new Family(father,mother);
      System.out.println(fam.toString());
      fam.addChild(child1);
      fam.addChild(child2);
      System.out.println(fam.toString());


      //    while(true){
    //     new Human("nermin","eliyeva",25);
     //    new Pet(Species.dog,"toplan",12,20,null,f);
    //     new Family();
    //  }

   }
}
