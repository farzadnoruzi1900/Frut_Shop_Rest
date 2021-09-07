package fruit_shop_rest.mvc.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class CustomerListDTO {
    private List<CustomerDTO> customers;
}
