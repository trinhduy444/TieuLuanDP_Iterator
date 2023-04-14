package ConcreteIterator;

import Inter.Iterator;
import Model.Student;

import java.util.Map;

public class MapStudentIterator implements Iterator<Student> {
    private Map<Integer, Student> students;

    private int position = 0;

    public MapStudentIterator(Map<Integer, Student>  students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return position < students.size();
    }

    @Override
    public Student next() {
        if (hasNext()) {
            return students.get(position++);
        }
        return null;
    }
}
