package Inter;

public interface Aggregate<T> {
    Iterator<T> createIterator();

    T getStudentById(int id);
    void  add(T t);
}
