package homework9;

import homework9.controller.FamilyController;
import homework9.model.*;

public class Main {
    public static void main(String[] args) {
        FamilyController familyController = new FamilyController();

        Woman mother = new Woman("Ayan", "Tagiyeva", 1958, 65);
        Man father = new Man("Terlan", "Tagiyev", 1956, 10);
        Human child = new Human("Aysu", "Tagiyeva", 1997, 185);
        Pet dog = new Dog("Tagi", 12, 99);

        familyController.createNewFamily(mother, father);
        familyController.adoptChild(familyController.getFamilyById(1), child);
        familyController.addPet(0, dog);

        Woman mother2 = new Woman("Maryam", "Qarayeva", 1969, 10);
        Man father2 = new Man("Mehdi", "Qarayev", 1963, 121);
        Human child2 = new Human("Aslan", "Qarayev", 1991, 154);
        Pet domesticCat = new DomesticCat("Garfield", 11, 71);

        familyController.createNewFamily(mother2, father2);
        familyController.adoptChild(familyController.getFamilyById(2), child2);
        familyController.addPet(1, domesticCat);


        familyController.getFamiliesLessThan(1);
        familyController.familiesMemberCount(2);
        familyController.getFamiliesMoreThan(1);
        familyController.familiesMemberCount(4);
        familyController.deleteFamilyByIndex(1);;

    }
}