package without.xml;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private String subject;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
