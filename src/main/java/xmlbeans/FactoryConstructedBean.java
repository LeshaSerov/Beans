package xmlbeans;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
@Getter
public class FactoryConstructedBean {
    private Integer number;

    public FactoryConstructedBean(Integer number) {
        log.info(this.getClass().getCanonicalName() + " create.");
        this.number = number;
    }
}
