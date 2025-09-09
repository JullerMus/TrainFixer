package org.example.LinkedList;

public class MyLinkedList<T> implements MyList<T> {

    private Node<T> head;
    private int size;

    private static class Node<T>{
        T data;
        Node<T> next;

        Node(T data){
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
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if(head == null){
            return false;
        }
        Node<T> node = head;
        while(node.next != null){
            if(node.next.data.equals(o)){
                node.next = node.next.next;
                size--;
            }
        }
        return true;
    }

    @Override
    public T get(int index) {
        Node<T> node = head;
        for(int i = 0; i < index; i++){
            node = node.next;

            if(node.data.equals(head.data)){
                return node.data;
            }
        }
        return null;
    }

    @Override
    public T set(int index, T element) {
        Node<T> node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
            if(node.data.equals(element)){
                node.next = node.next.next;
            }
            else{
                node.next = node.next.next;
            }
        }
        return node.data;
    }

    @Override
    public boolean contains(Object o) {
        Node<T> node = head;
        while(node.next != null){
            if(node.next.data.equals(o)){
                return true;
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
        if(head == null){
            return true;
        }
        return false;
    }


    //NB! Korrekt implementation?
    @Override
    public MyList<T> subList(int fromIndex, int toIndex) {
        MyList<T> sublist = new MyLinkedList<T>();
        for(int i = fromIndex; i < toIndex; i++){
            sublist.add(get(i));
        }
        return sublist;
    }




}
