package stereotype.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("guest1")
public class Guests {

    @Value("john cena")
    private String name;
    @Value("32")
    private int age;

    @Override
    public String toString() {
        return "Guests{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
