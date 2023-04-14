package Iterator;

import Aggregate.StudentList;
import Model.Student;

import java.util.List;

public class ListStudentIterator implements Iterator<Student> {
    private StudentList students;

    private int position = 0;

    public ListStudentIterator(StudentList students) {
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
