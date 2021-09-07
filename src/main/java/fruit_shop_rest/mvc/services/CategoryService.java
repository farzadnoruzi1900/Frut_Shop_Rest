package fruit_shop_rest.mvc.services;

import fruit_shop_rest.mvc.api.v1.model.CategoryDTO;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}


