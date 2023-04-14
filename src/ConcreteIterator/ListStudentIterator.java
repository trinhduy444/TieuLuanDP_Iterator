package ConcreteIterator;

import Inter.Iterator;
import Model.Student;

import java.util.List;

public class ListStudentIterator implements Iterator<Student> {
    private List<Student> students;

    private int position = 0;

    public ListStudentIterator(List<Student> students) {
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
