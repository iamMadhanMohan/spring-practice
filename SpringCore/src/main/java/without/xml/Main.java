package without.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig2.class);

//        Student std = context.getBean("student", Student.class);
//        System.out.println(std);

        Student2 std2 = context.getBean("getStudent2", Student2.class);
        System.out.println(std2);
    }
}
