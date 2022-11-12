package xmlbeans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class BeanFactory {
    public FactoryConstructedBean createBean(Integer number){
        log.info(BeanFactory.class.getCanonicalName() + " used.");
        return new FactoryConstructedBean(number);
    }
}
