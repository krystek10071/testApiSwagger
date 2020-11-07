package swaggerExample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.mappers.VendorExtensionsMapper;

import java.util.Collection;
import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class SpringBootSwaggerExampleApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringBootSwaggerExampleApplication.class, args);
    }

    @Bean
    public Docket get() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
              //  .paths(PathSelectors.ant("/api/**"))
                .apis(RequestHandlerSelectors.basePackage("swaggerExample"))
                .build().apiInfo(createApiInfo());
    }

    private ApiInfo createApiInfo(){
        return new ApiInfo("StudentsApi", "ogolnie chujna", "1.0000", "dasdadadasd00", new Contact("kris", "kris.pl", "das"),
                 "dsadas", "dsdsdsd",
                Collections.emptyList());
    }

}
