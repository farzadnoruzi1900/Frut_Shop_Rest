package fruit_shop_rest.mvc.api.v1.mapper;

import fruit_shop_rest.mvc.api.v1.model.CategoryDTO;
import fruit_shop_rest.mvc.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);


    CategoryDTO categoryToCategoryDTO(Category category);
}
