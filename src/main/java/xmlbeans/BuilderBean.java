package xmlbeans;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BuilderBean {
    public static BuilderBean builder(){
        log.info(BuilderBean.class.getCanonicalName() + " create.");
        return new BuilderBean();
    }
}
