package fruit_shop_rest.mvc.services;

import fruit_shop_rest.mvc.api.v1.mapper.CategoryMapper;
import fruit_shop_rest.mvc.api.v1.model.CategoryDTO;
import fruit_shop_rest.mvc.repositories.CategoryRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepositories categoryRepositories;
    private final CategoryMapper categoryMapper;

    public CategoryServiceImpl(CategoryRepositories categoryRepositories, CategoryMapper categoryMapper) {
        this.categoryRepositories = categoryRepositories;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {

        return StreamSupport.stream(categoryRepositories.findAll().spliterator(), false)
                .map(categoryMapper::categoryToCategoryDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategoryByName(String name) {
        return categoryMapper.categoryToCategoryDTO(categoryRepositories.findByName(name));
    }
}
