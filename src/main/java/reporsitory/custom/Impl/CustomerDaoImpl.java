package reporsitory.custom.Impl;

import entity.CustomerEntity;
import reporsitory.custom.CustomerDao;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean save(CustomerEntity entity) {
        System.out.println("Reporsitory : "+entity);
        return false;
    }

    @Override
    public boolean update(String s, CustomerEntity entity) {
        return false;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public CustomerEntity search(String s) {
        return null;
    }

    @Override
    public List<CustomerEntity> getAll() {
        return List.of();
    }
}
