package homework10.service;

import homework10.dao.FamilyDao;
import homework10.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FamilyService {
    FamilyDao familyDao = new FamilyDao();
    public void getFamiliesMoreThan(int count) {
        familyDao.getAllFamilies()
                .stream()
                .filter(family -> family.countFamily() > count)
                .forEach(System.out::println);
    }
    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void showAllFamilies() {
        familyDao.getAllFamilies()
                .forEach(System.out::println);
    }

    public void familiesMemberCount(int memberCount) {
        System.out.println(
                familyDao.getAllFamilies()
                        .stream()
                        .filter(family -> family.countFamily() == memberCount)
                        .count()
        );
    }

    public void deleteFamilyByIndex(int index) {
        familyDao.getAllFamilies()
                .remove(index);
    }
    public Family createNewFamily(Man father, Woman mother) {
        return familyDao.saveFamily(new Family(mother, father));
    }
    public void getFamiliesLessThan(int count) {
        familyDao.getAllFamilies()
                .stream()
                .filter(family -> family.countFamily() < count)
                .forEach(System.out::println);
    }

    public Family adoptChild(Family family, Human human) {
        family.addChild(human);
        return family;
    }

    public int count() {
        return familyDao
                .getAllFamilies()
                .size();
    }

    public Family getFamilyById(int id) {
        return familyDao
                .getAllFamilies()
                .get(id - 1);
    }

    public ArrayList<Pet> getPets(int index) {
        return familyDao
                .getAllFamilies()
                .get(index).getPets();
    }
    public void deleteAllChildrenOlder(int age) {
        familyDao.getAllFamilies()
                .forEach(family -> {
                    List<Human> olderChild = family.getChildren()
                            .stream()
                            .filter(child -> child.getAge() > age)
                            .collect(Collectors.toList());
                    family.getChildren().removeAll(olderChild);
                });
    }
    public void addPet(int index, Pet pet) {
        familyDao.getAllFamilies()
                .get(index)
                .getPets()
                .add(pet);
    }

}