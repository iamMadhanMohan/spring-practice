package Spring.orm;

import Spring.orm.dao.StudentDao;
import Spring.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("hibernateConfig.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        Student student = new Student();
        student.setStudentId(13);
        student.setStudentName("Kevin Owens");
        student.setStudentCity("Texas");

        int result = studentDao.insert(student);
        System.out.println(result);
    }
}
