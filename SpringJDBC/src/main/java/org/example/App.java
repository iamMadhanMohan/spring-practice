package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started..." );
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Person obj = context.getBean("person", Person.class);
        System.out.println(obj);
    }
}
