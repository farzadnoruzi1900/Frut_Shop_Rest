package fruit_shop_rest.mvc.services;

import fruit_shop_rest.mvc.api.v1.mapper.CustomerMapper;
import fruit_shop_rest.mvc.api.v1.model.CustomerDTO;
import fruit_shop_rest.mvc.domain.Customer;
import fruit_shop_rest.mvc.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return StreamSupport.stream(customerRepository.findAll().spliterator(), false)
                .map(customer -> {
                    CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);
                    customerDTO.setUrl("/api/v1/customers/" + customerDTO.getId());
                    return customerDTO;

                }).collect(Collectors.toList());

    }

    @Override
    public CustomerDTO findCustomerById(Long id) {

        return customerMapper.customerToCustomerDTO(
                customerRepository.findById(id).orElseThrow(RuntimeException::new));
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {


        return saveAndReturnDTO(customerMapper.customerDTOToCustomer(customerDTO));
    }

    //we extract the concept from createCustomer method then we can use it for
    //saveCustomerByDTO too
    private CustomerDTO saveAndReturnDTO(Customer customer) {
        Customer customer1 = customerRepository.save(customer);
        CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer1);
        customerDTO.setUrl("/api/v1/customers/" + customerDTO.getId());
        return customerDTO;
    }

    //we need this method when we do put operation , to set the id
    @Override
    public CustomerDTO saveCustomerByDTO(Long id, CustomerDTO customerDTO) {
        Customer customer = customerMapper.customerDTOToCustomer(customerDTO);
        customer.setId(id);
        return saveAndReturnDTO(customer);
    }


}
