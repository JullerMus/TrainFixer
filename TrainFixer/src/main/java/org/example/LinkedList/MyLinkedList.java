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


}
