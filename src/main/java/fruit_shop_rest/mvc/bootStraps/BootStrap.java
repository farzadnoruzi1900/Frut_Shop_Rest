package fruit_shop_rest.mvc.bootStraps;

import fruit_shop_rest.mvc.domain.Category;
import fruit_shop_rest.mvc.domain.Customer;
import fruit_shop_rest.mvc.repositories.CategoryRepositories;
import fruit_shop_rest.mvc.repositories.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BootStrap implements CommandLineRunner {
    private final CategoryRepositories categoryRepository;
    private final CustomerRepository customerRepository;

    public BootStrap(CategoryRepositories categoryRepository, CustomerRepository customerRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        createCategory();
        createCustomer();
    }

    private void createCustomer() {
        Customer hassan = new Customer();
        hassan.setName("hassan");
        hassan.setLastName("javadi");

        Customer farzad = new Customer();
        farzad.setName("farzad");
        farzad.setLastName("javadi");

        Customer razi = new Customer();
        razi.setName("razi");
        razi.setLastName("Asghari");

        Customer reza = new Customer();
        reza.setName("Reza");
        reza.setLastName("khizab");

        customerRepository.save(hassan);
        customerRepository.save(razi);
        customerRepository.save(reza);
        customerRepository.save(farzad);

        log.info("Data Loaded = " + customerRepository.count());


    }

    private void createCategory() {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);


        log.info("Data Loaded = " + categoryRepository.count());
    }
}
