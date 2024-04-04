package without.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig2 {

    @Bean
    public Student2 getStudent2(){
        return new Student2();
    }
}
