package service.custom.impl;

import dto.Customer;
import entity.CustomerEntity;
import jakarta.inject.Inject;
import org.modelmapper.ModelMapper;
import repository.custom.CustomerDao;
import service.custom.CustomerService;

import java.util.List;

public class CustomerServiceImpl  implements CustomerService {
    @Inject
    CustomerDao dao;
    @Override
    public boolean addCustomer(Customer customer) {
        System.out.println("service : "+customer);
        dao.save(new ModelMapper().map(customer, CustomerEntity.class));
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return false;
    }

    @Override
    public Customer searchCustomer(String id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return List.of();
    }

    @Override
    public boolean deleteCustomer(String id) {
        return false;
    }
}
