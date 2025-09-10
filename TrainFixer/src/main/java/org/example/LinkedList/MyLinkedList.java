package org.example.LinkedList;

public class MyLinkedList<T> implements MyList<T> {

    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public boolean add(T data) {

        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (head == null) {
            return false;
        }
        if (o == null) {
            if (head.data == null) {
                head = head.next;
                size--;
                return true;
            }
            Node<T> current = head;
            while (current.next != null) {
                if (current.next.data == null) {
                    current.next = current.next.next;
                    size--;
                    return true;
                }
                current = current.next;
            }
        } else {
            // Handle non-null removal
            if (o.equals(head.data)) {
                head = head.next;
                size--;
                return true;
            }
            Node<T> current = head;
            while (current.next != null) {
                if (o.equals(current.next.data)) {
                    current.next = current.next.next;
                    size--;
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public T set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        T oldData = current.data;
        current.data = element;
        return oldData;
    }

    @Override
    public boolean contains(Object o) {
        Node<T> current = head;

        if (o == null) {
            while (current != null) {
                if (current.data == null) {
                    return true;
                }
                current = current.next;
            }
        } else {
            while (current != null) {
                if (o.equals(current.data)) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public MyList<T> subList(int fromIndex, int toIndex) {

        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("fromIndex: " + fromIndex + ", toIndex: " + toIndex + ", Size: " + size);
        }

        MyList<T> sublist = new MyLinkedList<>();
        for (int i = fromIndex; i < toIndex; i++) {
            sublist.add(get(i));
        }
        return sublist;
    }

    public void display() {
        System.out.print("[");
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }
}
