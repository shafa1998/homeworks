package homework6;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    Human mother= new Human("Meryam","Quliyeva",34);
    Human father= new Human("Ali","Quliyev",35);
    Human child1=new Human("Farid","Quliyev",8);
    Human child2=new Human("Narmin","Quliyeva",5);
    Human child3=new Human("Ruslan","Quliyev",1);
    Family fam=new Family(father,mother);
    Pet hamster=new Pet();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        fam.addChild(child1);
        fam.addChild(child2);


    }

    @org.junit.jupiter.api.Test
    void countFamily() {
        fam.setPet(hamster);
        assertEquals(5,fam.countFamily());
        fam.addChild(child3);
        assertEquals(6,fam.countFamily());
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
        Family f2=new Family(father,mother);
        f2.addChild(child1);
        f2.addChild(child2);
        assertTrue(fam.equals(f2));
        f2.setPet(hamster);
        assertTrue(fam.equals(f2));
        f2.addChild(child3);
        assertFalse(fam.equals(f2));
    }

    @org.junit.jupiter.api.Test
    void addChild() {
        assertEquals(2,fam.getChildren().length);
        fam.addChild(child3);
        assertEquals(3,fam.getChildren().length);
        assertEquals(child3,fam.getChildren()[2]);
    }

    @org.junit.jupiter.api.Test
    void deleteChildbyIndex() {
        fam.deleteChild(0);
        assertEquals(1,fam.getChildren().length);
        List<Human> children= Arrays.asList(fam.getChildren());
        assertFalse(children.contains(child1));
        fam.deleteChild(-1);
        assertEquals(1,fam.getChildren().length);
        fam.deleteChild(4);
        assertEquals(1,fam.getChildren().length);
    }

    @org.junit.jupiter.api.Test
    void deleteChild() {
        fam.deleteChild(child1);
        List<Human> children= Arrays.asList(fam.getChildren());
        assertFalse(children.contains(child1));

    }

    @org.junit.jupiter.api.Test
    void testToString() {
        String family0="Family{mother=Human{name='Ali', surname='Quliyev', year=35, iq=0, schedule=null}, father=Human{name='Meryam', surname='Quliyeva', year=34, iq=0, schedule=null}, children=[Human{name='Farid', surname='Quliyev', year=8, iq=0, schedule=null}, Human{name='Narmin', surname='Quliyeva', year=5, iq=0, schedule=null}], pet=null}";
        assertEquals(family0,fam.toString());
        fam.deleteChild(0);
        fam.deleteChild(1);
        String family="Family{mother=Human{name='Ali', surname='Quliyev', year=35, iq=0, schedule=null}, father=Human{name='Meryam', surname='Quliyeva', year=34, iq=0, schedule=null}, children=[null], pet=null}";
        assertEquals(family,fam.toString());

    //    String family2="Family{mother=Human{name='Ali', surname='Quliyev', year=35, iq=0, schedule=null}, father=Human{name='Meryam', surname='Quliyeva', year=34, iq=0, schedule=null}, children=[Human{name='Farid', surname='Quliyev', year=8, iq=0, schedule=null}, Human{name='Narmin', surname='Quliyeva', year=5, iq=0, schedule=null}], pet=null}";

    }
}