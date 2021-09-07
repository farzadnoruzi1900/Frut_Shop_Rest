package fruit_shop_rest.mvc.api.v1.mapper;

import fruit_shop_rest.mvc.api.v1.model.CustomerDTO;
import fruit_shop_rest.mvc.domain.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-07T18:40:29+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 14.0.2 (Private Build)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO customerToCustomerDTO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setId( customer.getId() );
        customerDTO.setName( customer.getName() );
        customerDTO.setLastName( customer.getLastName() );

        return customerDTO;
    }
}
