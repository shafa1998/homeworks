package homework10.controller;

import homework10.model.*;
import homework10.service.FamilyService;

import java.util.ArrayList;
import java.util.List;

public class FamilyController {
    private final FamilyService familyService;


    public void showAllFamilies() {
        familyService.showAllFamilies();
    }

    public void getFamiliesMoreThan(int size) {
        familyService.getFamiliesMoreThan(size);
    }
    public FamilyController() {
        this.familyService = new FamilyService();
    }
    public void getFamiliesLessThan(int size) {
        familyService.getFamiliesLessThan(size);
    }

    public void createNewFamily(Woman mother, Man father) {
        familyService.createNewFamily(father, mother);
    }

    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
    }
    public int count() {
        return familyService.count();
    }

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }
    public void adoptChild(Family family, Human human) {
        familyService.adoptChild(family, human);
    }
    public ArrayList<Pet> getPets(int index) {
        return familyService.getPets(index);
    }

    public void addPet(int index, Pet pet) {
        familyService.addPet(index, pet);
    }
    public void deleteAllChildrenOlder(int age) {
        familyService.deleteAllChildrenOlder(age);
    }

    public Family getFamilyById(int id) {
        return familyService.getFamilyById(id);
    }
    public void familiesMemberCount(int memberCount) {
        familyService.familiesMemberCount(memberCount);
    }
}