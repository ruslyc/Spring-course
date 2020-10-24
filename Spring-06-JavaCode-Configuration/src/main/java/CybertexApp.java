import configs.CybertekAppConfig;
import interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CybertexApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CybertekAppConfig.class);

        Course course = container.getBean("java", Course.class);

        System.out.println(course.toString());
    }
}
