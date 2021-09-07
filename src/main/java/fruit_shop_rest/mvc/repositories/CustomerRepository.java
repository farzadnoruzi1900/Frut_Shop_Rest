package fruit_shop_rest.mvc.repositories;

import fruit_shop_rest.mvc.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
    Customer findCustomerById(Long id);
}
