package homework11.dao;

import java.util.List;
import java.util.Optional;

public interface CollectionFamilyDAO<A> {
    List<A> getAllFamilies();
    Optional<A> getFamilyByIndex(int index);
    boolean deleteFamily(A family);
    boolean deleteFamily(int index);
    A saveFamily(A family);
}