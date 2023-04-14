package ConcreteAggregate;

import Inter.Aggregate;
import Inter.Iterator;
import Model.Student;
import ConcreteIterator.MapStudentIterator;

import java.util.HashMap;
import java.util.Map;

public class StudentMap implements Aggregate<Student> {
    private Map<Integer, Student> studentMap = new HashMap<>();


    public void add(Student student) {
        studentMap.put(student.getId(),student);
    }

    public Map<Integer, Student> getStudents() {
        return studentMap;
    }

    public Student getStudentById(int id) {
        return studentMap.get(id);
    }

    @Override
    public Iterator<Student> createIterator() {
        return new MapStudentIterator(studentMap);
    }
}