package fruit_shop_rest.mvc.services;

import fruit_shop_rest.mvc.api.v1.model.CustomerDTO;
import fruit_shop_rest.mvc.domain.Customer;
import jdk.dynalink.linker.LinkerServices;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> getAllCustomers();
    CustomerDTO findCustomerById(Long id);
    CustomerDTO createCustomer(CustomerDTO customerDTO);
    CustomerDTO saveCustomerByDTO(Long id,CustomerDTO customerDTO);
}
