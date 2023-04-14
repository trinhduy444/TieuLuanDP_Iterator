package ConcreteAggregate;

import ConcreteIterator.ListStudentIterator;
import Inter.Aggregate;
import Inter.Iterator;
import Model.Student;
import java.util.ArrayList;
import java.util.List;


public class StudentList implements Aggregate<Student> {
    private List<Student> studentList = new ArrayList<>();


    public void add(Student student) {
        studentList.add(student);
    }

    public List<Student> getStudents() {
        return studentList;
    }

    public Student getStudentById(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Iterator<Student> createIterator() {
       return new ListStudentIterator(studentList);
//        return null;
    }
}
