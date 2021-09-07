package fruit_shop_rest.mvc.services;

import fruit_shop_rest.mvc.api.v1.mapper.CustomerMapper;
import fruit_shop_rest.mvc.api.v1.model.CustomerDTO;
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
        return StreamSupport.stream(customerRepository.findAll().spliterator(),false)
                .map(customerMapper::customerToCustomerDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDTO findCustomerById(Long id) {
        return customerMapper.customerToCustomerDTO(customerRepository.findCustomerById(id));
    }
}
