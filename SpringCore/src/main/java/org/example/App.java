package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorInjection.xml");
//        Student student1 = (Student)context.getBean("student1");
//        System.out.println(student1);
//
//        Student student2 = (Student)context.getBean("student2");
//        System.out.println(student2);
//
//        Student student3 = (Student)context.getBean("student3");
//        System.out.println(student3);

        Student student6 = (Student)context.getBean("student6");
        System.out.println(student6);
    }
}