package com.madhan.hibernatejpa;

import com.madhan.hibernatejpa.Dao.StudentDao;
import com.madhan.hibernatejpa.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HibernateJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner -> {
			saveStudent(studentDao);
//			readStudent(studentDao);
//			readAllStudents(studentDao);
//			readStudentsByLastName(studentDao);
//			updateStudent(studentDao);
//			deleteStudent(studentDao);

		};
	}

	private void deleteStudent(StudentDao studentDao) {
		// get the record by id
		System.out.println("fetching student record...");
		Student student = studentDao.findById(4);

		// pass id to delete method
		System.out.println("deleting student record...");
		studentDao.delete(4);

		// display the deleted record
		System.out.println("deleted student record...");
		System.out.println(student);

	}

	private void updateStudent(StudentDao studentDao) {
		// get student by ID
		System.out.println("fetching student object...");
		Student student = studentDao.findById(4);

		// update fields using setter methods
		System.out.println("setting student fields...");
		student.setEmail("kevincena223@wwe.com");

		// update student object in db
		System.out.println("updating student object...");
		studentDao.update(student);

		// display updated student
		System.out.println("printing student object...");
		System.out.println(student);
	}

	private void readStudentsByLastName(StudentDao studentDao) {
		// get student list by last name
		System.out.println("finding the students by last name...");
		System.out.println("printing all students...");
		studentDao.findByLastName("cena")
				.forEach(student -> System.out.println(student));
	}

	private void readAllStudents(StudentDao studentDao) {
		// get student list
		System.out.println("finding all students...");
		List<Student> students = studentDao.findAllStudents();

		// display the student list
		System.out.println("printing all students...");
		students.forEach(student -> System.out.println(student));
	}

	private void saveStudent(StudentDao studentDao) {
		// create student object
		System.out.println("creating the student...");
		Student student = new Student("Devilliers", "AB", "devilrcb@bcc.com");

		// save student object using save method
		System.out.println("saving the student...");
		studentDao.save(student);

		// display the id or status of save method
		System.out.println("Saved Student Id : " + student.getId());
	}

	private void readStudent(StudentDao studentDao){
		// get student object from database
		System.out.println("fetching student object using id...");
		Student student = studentDao.findById(2);

		//display the student object
		System.out.println(student);
	}
}
