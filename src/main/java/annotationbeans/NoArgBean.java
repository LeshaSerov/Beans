package annotationbeans;

import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NoArgBean {
    public NoArgBean() {
        log.info(this.getClass().getCanonicalName() + " create.");
    }
}
