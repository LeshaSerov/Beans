package annotationbeans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Slf4j
@Component
public class BookBean {
    Integer numberOfPages;
    String name;

    public BookBean(Integer numberOfPages, String name) {
        log.info(this.getClass().getCanonicalName() + " create.");
        this.numberOfPages = numberOfPages;
        this.name = name;
    }
}
