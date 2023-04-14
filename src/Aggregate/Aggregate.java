package Aggregate;

import Iterator.Iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();

    T getStudentById(int id);
    void  add(T t);
    int size();
    T get(int num);
}
