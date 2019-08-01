package gavinjs.chapter1.service;

import gavinjs.chapter1.helper.DatabaseHelper;
import gavinjs.chapter1.model.Customer;

import java.util.List;
import java.util.Map;

public class CustomerService {


//    获取客户列表
    public List<Customer> getCustomerList() {
        // TODO
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

//    获取客户
    public Customer getCustomer(long id) {
        // TODO
        return null;
    }

    public boolean createCustomer(Map<String, Object> fieldMap) {
        //TODO
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        //TODO
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    public boolean deleteCustomer(long id) {
        //TODO
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
