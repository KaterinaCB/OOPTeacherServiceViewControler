package model;

public class Student extends User implements Comparable<Student>{
    private int studentId;


    public Student(int studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        studentId = studentId;
    }

    @Override
    public String toString() {
        return "model.Student{" +
                "studentId=" + studentId + '\'' +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        if(o.getStudentId() >studentId){
            return -1;
        }
        if(o.getStudentId() < studentId){
            return 1;
        }
        return 0;
    }
}