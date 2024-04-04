package org.example;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;

    private Subjects studentSubject;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Subjects getStudentSubject() {
        return studentSubject;
    }

    public void setStudentSubject(Subjects studentSubject) {
        this.studentSubject = studentSubject;
    }

    public Student() {
    }

    public Student(int studentId, String studentName, String studentAddress, Subjects studentSubject) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentSubject = studentSubject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentSubject=" + studentSubject +
                '}';
    }
}
