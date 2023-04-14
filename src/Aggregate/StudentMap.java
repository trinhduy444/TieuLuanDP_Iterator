package Aggregate;

import Model.Student;

import java.util.HashMap;
import java.util.Map;
import Iterator.*;
public class StudentMap implements Aggregate<Student>{
    private Map<Integer, Student> studentMap = new HashMap<>();


    public void add(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public int size() {
        return studentMap.size();
    }

    @Override
    public Student get(int num) {
        return studentMap.get(num);
    }


    public Student getStudentById(int id) {
        return studentMap.get(id);
    }

    @Override
    public Iterator<Student> createIterator() {
        return new MapStudentIterator((StudentMap) studentMap);
    }
}
