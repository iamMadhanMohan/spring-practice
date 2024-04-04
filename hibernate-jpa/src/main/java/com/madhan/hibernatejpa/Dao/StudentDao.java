package com.madhan.hibernatejpa.Dao;

import com.madhan.hibernatejpa.entity.Student;

import java.util.List;

public interface StudentDao {
    public void save(Student student);

    public Student findById(Integer id);

    public List<Student> findAllStudents();

    public List<Student> findByLastName(String lastName);

    public void update(Student student);

    public void delete(Integer id);
}
