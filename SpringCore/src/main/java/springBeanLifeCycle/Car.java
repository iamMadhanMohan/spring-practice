package springBeanLifeCycle;

public class Car {
    private String carName;

    public void setCarName(String carName){
        this.carName = carName;
        System.out.println("In Setter method : setting car name");
    }

    public Car() {
        System.out.println("In constructor method...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                '}';
    }

    public void init(){
        System.out.println("In In-It method : car is starting");
    }

    public void destroy(){
        System.out.println("In Destroy method: car stopped");
    }

}
