package annotationbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationService {
    @Bean
    BookBean bookBean(){
        return new BookBean(1, "2");
    }
}
