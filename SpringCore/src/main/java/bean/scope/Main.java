package bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanscope.xml");

        Persons obj1 = context.getBean("persons", Persons.class);
        System.out.println(obj1.hashCode());

        Persons obj2 = context.getBean("persons", Persons.class);
        System.out.println(obj2.hashCode());
    }
}
