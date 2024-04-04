package jdbc.dao;

import jdbc.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Student student) {
        String query = "insert into student(id, name, city) values(?,?,?)";
        int result = jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return result;
    }

    @Override
    public int update(Student student) {
        String query = "update student set city=? where id=?";
        int result = jdbcTemplate.update(query, student.getCity(), student.getId());
        return result;
    }

    @Override
    public int delete(int studentId) {
        String query = "delete from student where id=?";
        return jdbcTemplate.update(query,studentId);
    }

    @Override
    public Student getStudentById(int studentId) {
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        return jdbcTemplate.queryForObject(query, rowMapper, studentId);

        // USING LAMBDA
//        return jdbcTemplate.queryForObject(query, (rs, rowNum) -> {
//            Student student = new Student();
//            student.setId(rs.getInt(1));
//            student.setName(rs.getString(2));
//            student.setCity(rs.getString(3));
//            return student;
//        }, studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        String query = "select * from student";
        return jdbcTemplate.query(query, new RowMapperImpl());
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
