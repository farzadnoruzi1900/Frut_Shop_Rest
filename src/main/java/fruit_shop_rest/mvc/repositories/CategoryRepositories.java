package fruit_shop_rest.mvc.repositories;

import fruit_shop_rest.mvc.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepositories extends CrudRepository<Category,Long> {
    Category findByName(String name);
}
