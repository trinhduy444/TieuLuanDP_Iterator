package Aggregate;

import Iterator.Iterator;
import Model.Student;

import java.util.ArrayList;
import java.util.List;

import Iterator.ListStudentIterator;
public class StudentList implements Aggregate<Student>{
    private List<Student> studentList = new ArrayList<>();

    @Override
    public Iterator<Student> createIterator() {
        return new ListStudentIterator((StudentList) studentList);
    }

    @Override
    public Student getStudentById(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public int size() {
        return studentList.size();
    }

    @Override
    public Student get(int num) {
        return studentList.get(num);
    }
}
