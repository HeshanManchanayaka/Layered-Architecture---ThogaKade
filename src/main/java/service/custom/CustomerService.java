package service.custom;

import dto.Customer;
import service.SuperService;

import java.util.List;

public interface CustomerService extends SuperService {
    boolean addCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    Customer searchCustomer(String id);
    List<Customer> getAll();
    boolean deleteCustomer(String id);
}
