package springBeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CarAnnotation {
    private String carName;

    public CarAnnotation() {
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "CarAnnotation{" +
                "carName='" + carName + '\'' +
                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("---In InIt method");
    }
    @PreDestroy
    public void end(){
        System.out.println("---In Destroy method");
    }
}
