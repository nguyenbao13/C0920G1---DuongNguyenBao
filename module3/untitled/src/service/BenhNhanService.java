package service;

import model.BenhNhan;

import java.sql.SQLException;
import java.util.List;

public interface BenhNhanService {
    List<BenhNhan> findAll();
    List<BenhNhan> findByName(String name);
    BenhNhan findById(String id);
    String insert(BenhNhan benhNhan) throws SQLException;
    void delete(String id) throws SQLException;
    void update(BenhNhan benhNhan) throws SQLException;
}
