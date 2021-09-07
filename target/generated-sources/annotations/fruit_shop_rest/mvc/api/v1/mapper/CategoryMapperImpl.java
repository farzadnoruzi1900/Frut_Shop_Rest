package fruit_shop_rest.mvc.api.v1.mapper;

import fruit_shop_rest.mvc.api.v1.model.CategoryDTO;
import fruit_shop_rest.mvc.domain.Category;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-07T18:12:23+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 14.0.2 (Private Build)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDTO categoryToCategoryDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setId( category.getId() );
        categoryDTO.setName( category.getName() );

        return categoryDTO;
    }
}
