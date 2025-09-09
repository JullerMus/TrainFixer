package org.example.LinkedList;

public interface MyList<T> {
    /**
     * Adds an element to the linked list
     * @param element Node to be added
     * @return An updated linked list with the added node
     */
    boolean add(T element);

    /**
     * Removes an element for a linked list
     * @param element
     * @return
     */
    boolean remove(T element);

    T get(int index);
    T set(int index, T element);

    boolean contains(T element);
    int size();
    boolean isEmpty();

   // T[] toArray(); //relevans?

    MyList<T> subList(int fromIndex, int toIndex);


}
