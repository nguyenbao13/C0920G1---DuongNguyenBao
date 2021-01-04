package service;

import model.BenhNhan;
import repository.BenhNhanRepository;
import repository.BenhNhanRepositoryImpl;

import java.sql.SQLException;
import java.util.List;

public class BenhNhanServiceImpl implements BenhNhanService {
    BenhNhanRepository benhNhanRepository = new BenhNhanRepositoryImpl();
    @Override
    public List<BenhNhan> findAll() {
        return benhNhanRepository.findAll();
    }

    @Override
    public List<BenhNhan> findByName(String name) {
        return benhNhanRepository.findByName(name);
    }

    @Override
    public BenhNhan findById(String id) {
        return benhNhanRepository.findById(id);
    }

    @Override
    public String insert(BenhNhan benhNhan) throws SQLException {
        benhNhanRepository.insert(benhNhan);
        return null;
    }

    @Override
    public void delete(String id) throws SQLException {
        benhNhanRepository.delete(id);
    }

    @Override
    public void update(BenhNhan benhNhan) throws SQLException {
        benhNhanRepository.update(benhNhan);
    }
}
