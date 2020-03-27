package homework11.controller;

import homework11.model.*;
import homework11.service.FamilyService;

import java.util.ArrayList;
import java.util.List;

public class FamilyController {
    private final FamilyService familyService;

    public FamilyController() {
        this.familyService = new FamilyService();
    }

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void showAllFamilies() {
        familyService.displayAll();
    }

    public void getFamiliesMoreThan(int size) {
        familyService.getFamilyBiggerThan(size);
    }

    public void getFamiliesLessThan(int size) {
        familyService.getFamiliesLessThan(size);
    }

    public void familiesMemberCount(int memberCount) {
        familyService.familiesMemberCount(memberCount);
    }
    public void createNewFamily(Woman mother, Man father) {
        familyService.createNewFamily(father, mother);
    }

    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
    }

    public void adoptChild(Family family, Human human) {
        familyService.adoptChild(family, human);
    }

    public void deleteAllChildrenOlder(int age) {
        familyService.deleteAllChildrenOlder(age);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyById(int id) {
        return familyService.getFamilyById(id);
    }

    public ArrayList<Pet> getPets(int index) {
        return familyService.getPets(index);
    }

    public void addPet(int index, Pet pet) {
        familyService.addPet(index, pet);
    }
}