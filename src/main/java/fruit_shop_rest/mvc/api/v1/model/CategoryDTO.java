package fruit_shop_rest.mvc.api.v1.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

/*
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
*/
public class CategoryDTO {
    private Long id;
    private String name;
    // by using the annotation then even if you do not devclate the public getter and setter
//    or set the fields public it can read the from the private field .

    public CategoryDTO() {
    }

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
