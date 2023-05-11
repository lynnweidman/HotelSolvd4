package com.Model.HotelManagment;

public class CustomLinkedList<E> {
    private Node<E> head;  // head of list
    private Node<E> tail;

    /* Node Class */
    static class Node<E> {
        E data;
        Node<E> next;

        // Constructor to create a new node
        Node(E data) {
            this.data = data;
            next = null;
        }
    }

    //Inserts at the front of the list.
    public void insertFirst(E new_data) {
    /* Allocate the Node &
              Put in the data*/
        Node<E> new_node = new Node(new_data);

        /*  Make next of new Node as head */
        new_node.next = head;

        /*  Move the head to point to new Node */
        head = new_node;
        if (tail == null) {
            tail = new_node;
        }
    }

    public void insertLast(E new_data) {
        if (tail == null) {
            insertFirst(new_data);
            return;
        }
        Node<E> temp = new Node<E>(new_data);
        tail.next = temp;
        tail = temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> temp = head;
        while (temp != null) {
            sb.append(temp.data).append("->");
            if (temp == tail) sb.append("End");
            temp = temp.next;
        }
        return sb.toString();
    }

}


