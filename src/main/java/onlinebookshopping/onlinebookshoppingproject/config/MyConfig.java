package onlinebookshopping.onlinebookshoppingproject.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public ModelMapper mapper() {
        ModelMapper m = new ModelMapper();
        return m;
    }




}
