package jdbc;

import jdbc.dao.StudentDao;
import jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao = context.getBean("studentDaoImpl", StudentDao.class);

        Student student = new Student();

        // INSERT
//        student.setId(14);
//        student.setName("Seth");
//        student.setCity("New york");
//
//        int result = studentDao.insert(student);
//        System.out.println("rows inserted : " + result);

        // UPDATE
//        student.setId(13);
//        student.setName("seth");
//        student.setCity("mumbai");
//
//        int result2 = studentDao.update(student);
//        System.out.println("rows updated : " + result2);

        // DELETE
//        System.out.println("rows deleted : "+studentDao.delete(13));

        // SELECT
        System.out.println(studentDao.getStudentById(13));

        // SELECT ALL
        List<Student> students = studentDao.getAllStudents();
        for(Student s: students){
            System.out.println(s);
        }
    }
}
