import org.springframework.context.support.ClassPathXmlApplicationContext;
import xmlbeans.BuilderBean;
import xmlbeans.UserBean;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContext.xml"
        );
        context.getBean("userBean", UserBean.class);
        context.getBean(UserBean.class);
        context.getBean(BuilderBean.class);
        context.getBean(Number.class);
    }
}
