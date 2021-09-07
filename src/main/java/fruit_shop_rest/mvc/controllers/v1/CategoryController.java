package fruit_shop_rest.mvc.controllers.v1;

import fruit_shop_rest.mvc.api.v1.model.CategoryDTO;
import fruit_shop_rest.mvc.api.v1.model.CategoryListDTO;
import fruit_shop_rest.mvc.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/api/v1/categories/")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
/*so as you can see when you are working with restful Api you are supposed to send back the response
            in form of responseEntity response entity constructor gets two parameter one the
            pojo object which is supposed to be map to jason by kackson and other is the status code you want
            to have by that response action .*/
    @GetMapping
    public ResponseEntity<CategoryListDTO> getAllCategories(){
        return new ResponseEntity<CategoryListDTO>(new CategoryListDTO(categoryService.getAllCategories()),HttpStatus.OK);
    }

    @GetMapping("{name}")
    public ResponseEntity<CategoryDTO> getCategoryByName(@PathVariable String name ){
        return new ResponseEntity<CategoryDTO>(categoryService.getCategoryByName(name),HttpStatus.OK);
    }
}
