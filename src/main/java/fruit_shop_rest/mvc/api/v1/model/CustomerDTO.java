package fruit_shop_rest.mvc.api.v1.model;

public class CustomerDTO {
    private Long id;
    private String name;
    private String lastName;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CustomerDTO() {
    }

    public CustomerDTO(Long id, String name, String lastName,String url) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.url=url;
    }
}
