package com.madhan.hibernatejpa.Dao;

import com.madhan.hibernatejpa.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao{

    // define entity manager field
    private EntityManager entityManager;

    // inject entity manager object using constructor injection
    public StudentDaoImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    // override save method
    @Override
    @Transactional // used when we update the database
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAllStudents() {
        // create a query
        TypedQuery<Student> query = entityManager.createQuery("from Student", Student.class);

        // execute the query
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        // create a query
        TypedQuery<Student> query = entityManager.createQuery(
                "from Student where lastName=:theData", Student.class);

        // set query parameters
        query.setParameter("theData", lastName);

        // execute the query
        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        // get student from db using id
        Student student = entityManager.find(Student.class, id);

        // delete student object from db
        entityManager.remove(student);
    }
}
