package fruit_shop_rest.mvc.api.v1.mapper;

import fruit_shop_rest.mvc.api.v1.model.CustomerDTO;
import fruit_shop_rest.mvc.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE= Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);
}
