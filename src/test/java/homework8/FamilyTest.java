package homework8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class FamilyTest {
    private Family family;
    private Human child1=new Human("Leman","Babayeva",2010);
    private Human child2=new Human("Elvin","Babayev",2015);
    private List<Human> children = new ArrayList<>();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        this.family=new Family();
        children.add(child1);
        children.add(child2);
        family.setChildren(children);
    }

    @org.junit.jupiter.api.Test
    void countFamilyTest() {
        assertEquals(4,family.countFamily());
    }


    @org.junit.jupiter.api.Test
    void addChildTest() {
        assertEquals(2, children.size());
    }

    @org.junit.jupiter.api.Test
    void deleteChildByNameTest() {
        family.deleteChildByName(child1);
      assertEquals(1, children.size());
    }
    @org.junit.jupiter.api.Test
    void deleteChildByindexTest() {
        family.deleteChildByIndex(0);
        assertEquals(1,children.size());
    }
    @org.junit.jupiter.api.Test
    void testToStringTest() {
        String expected="Family{" +
                "mother=null"  +
                ", father=null" +
                ", children=" + children +
                ", pets=null" +
                '}';
        assertEquals(expected,family.toString());
    }
}


//private Family family;
//    private Human child1=new Human("Alex","Miller",2016);
//    private Human child2=new Human("Martin","Miller",2019);
//    private List<Human> children = new ArrayList<>();
//
//    @BeforeEach
//    public void BeforeEach(){
//        this.family=new Family();
//        children.add(child1);
//        children.add(child2);
//        family.setChildren(children);
//    }
//    @Test
//    public void testAddChild(){
//      assertEquals(2, children.size());
//    }
//    @Test
//    public void testDeleteChildByName(){
//      family.deleteChild(child1);
//      assertEquals(1, children.size());
//     }
//    @Test
//    public void testDeleteChildByIndex(){
//        family.deleteChild(0);
//        assertEquals(1,children.size());
//    }
//    @Test
//    public void testCountFamily(){
//        assertEquals(4,family.countFamily());
//    }
//    @Test
//    public void testToString(){
//        String expected="Family{" +
//                "mother=null"  +
//                ", father=null" +
//                ", pet=[]" +
//                ", children=" + children +
//                '}';
//        assertEquals(expected,family.toString());
//    }