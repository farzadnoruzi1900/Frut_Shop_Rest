package fruit_shop_rest.mvc.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

@Data
@AllArgsConstructor
public class CategoryListDTO {

   private List<CategoryDTO> categories;
}
