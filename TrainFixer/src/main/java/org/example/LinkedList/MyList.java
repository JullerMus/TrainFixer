package org.example.LinkedList;

public interface MyList<T> {
    boolean add(T element);
    boolean remove(T element);

    T get(int index);
    T set(int index, T element);

    boolean contains(T element);
    int size();
    boolean isEmpty();

    T[] toArray();

    MyList<T> subList(int fromIndex, int toIndex);


}
