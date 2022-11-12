package xmlbeans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class UserBean {
    private String name;

    public UserBean(String name) {
        log.info(this.getClass().getCanonicalName() + " create.");
        this.name = name;
    }
}
