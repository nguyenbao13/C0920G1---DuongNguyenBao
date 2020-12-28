package repository;

import java.util.List;

public interface CRUDRepository<T> {
    List<T> findAll();
    T findById(String id);
    void save(T t);
    void delete(int id);
}
