package auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
//        User obj = context.getBean("user", User.class);
//        System.out.println(obj);

        AutoWireAnnotation obj2 = context.getBean("autoWireAnnotationClass", AutoWireAnnotation.class);
        System.out.println(obj2);
    }
}
