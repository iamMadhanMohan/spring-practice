package springBeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SuvCar implements InitializingBean, DisposableBean {
    private String carName;

    public SuvCar(String carName) {
        this.carName = carName;
    }

    public SuvCar() {
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "SuvCar{" +
                "carName='" + carName + '\'' +
                '}';
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InIt method called---");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method called---");
    }
}
