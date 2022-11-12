import annotationbeans.BookBean;
import annotationbeans.ConfigurationService;
import annotationbeans.NoArgBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import xmlbeans.BuilderBean;
import xmlbeans.FactoryConstructedBean;
import xmlbeans.UserBean;

@ComponentScan("annotationbeans")
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(
                "appContext.xml"
        );
//        xmlApplicationContext.getBean("userBean", UserBean.class);
        xmlApplicationContext.getBean(UserBean.class);
        xmlApplicationContext.getBean(BuilderBean.class);
        xmlApplicationContext.getBean(FactoryConstructedBean.class);
        xmlApplicationContext.close();

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(NoArgBean.class);
        annotationConfigApplicationContext.register(ConfigurationService.class);
        annotationConfigApplicationContext.refresh();
        BookBean bookBean = annotationConfigApplicationContext.getBean(BookBean.class);
        System.out.println(bookBean.getName());

    }
}
