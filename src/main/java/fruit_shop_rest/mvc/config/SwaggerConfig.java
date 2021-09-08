package fruit_shop_rest.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /*After defining the Docket bean, its select()
    method returns an instance of ApiSelectorBuilder, which provides a way to control
    the endpoints exposed by Swagger.

    We can configure predicates for selecting
    RequestHandlers with the help of RequestHandlerSelectors and
    PathSelectors. Using any() for both will make documentation for our entire API
    available through Swagger.*/
    @Bean
    Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/");
    }
}
