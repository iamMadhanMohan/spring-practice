package springBeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
    public static void main(String[] args) {
        // this context will have bean lifecycle methods
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycleConfig.xml");

        // this will enable to call destroy method created by manual.
        // this method is needed for XML or Interface Configuration
        context.registerShutdownHook();

//        Car car = (Car)context.getBean("carBean");
//        System.out.println(car);

//        SuvCar suvCar = (SuvCar) context.getBean("suvCarBean");
//        System.out.println(suvCar);

        // to enable annotation config
        // go to xml and paste <context:annotation-config /> above all beans
        CarAnnotation carAnnotation = (CarAnnotation)context.getBean("annotationCarBean");
        System.out.println(carAnnotation);
    }
}
