package fruit_shop_rest.mvc.controllers.v1;

import fruit_shop_rest.mvc.api.v1.model.CategoryDTO;
import fruit_shop_rest.mvc.api.v1.model.CategoryListDTO;
import fruit_shop_rest.mvc.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(CategoryController.BASE_URL)
public class CategoryController {
    private final CategoryService categoryService;
    public static final String BASE_URL="/api/v1/categories/";

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
/*so as you can see when you are working with restful Api you are supposed to send back the response
            in form of responseEntity response entity constructor gets two parameter one the
            pojo object which is supposed to be map to jason by kackson and other is the status code you want
            to have by that response action .*/
    /*just know that in case you are using @RestController you can send in form of object that you have not
            the ResponseEntity*/
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CategoryListDTO getAllCategories(){
        return new CategoryListDTO(categoryService.getAllCategories());
    }

    @GetMapping("{name}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryDTO getCategoryByName(@PathVariable String name ){
        return categoryService.getCategoryByName(name);
    }
}
