package homework9.dao;

import homework9.model.Family;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class FamilyDao implements CollectionFamilyDAO<Family> {

    List<Family> families = new LinkedList<>();
    @Override
    public boolean deleteFamily(int index) {
        return families.remove(families.get(index));
    }

    @Override
    public boolean deleteFamily(Family family) {
        return families.remove(family);
    }
    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family saveFamily(Family family) {
        families.add(family);
        return family;
    }
    @Override
    public Optional<Family> getFamilyByIndex(int index) {
        return Optional.ofNullable(families.get(index));
    }
}