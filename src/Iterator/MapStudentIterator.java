package Iterator;

import Aggregate.StudentMap;
import Model.Student;

import java.util.Map;

public class MapStudentIterator implements Iterator<Student> {
    private StudentMap studentMap;

    private int position = 0;

    public MapStudentIterator(StudentMap  students) {
        this.studentMap = students;
    }


    @Override
    public boolean hasNext() {
        return position < studentMap.size();
    }

    @Override
    public Student next() {
        if (hasNext()) {
            return studentMap.get(position++);
        }
        return null;
    }
}
