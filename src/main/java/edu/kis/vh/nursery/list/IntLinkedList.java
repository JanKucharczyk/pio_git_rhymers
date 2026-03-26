package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentująca dwukierunkową listę powiązaną przechowującą liczby całkowite.
 */
public class IntLinkedList {

    private static final int EMPTY_RETURN_VALUE = -1;

    private Node last;

    /**
     * Dodaje nową wartość na koniec listy.
     *
     * @param i wartość całkowita do dodania do listy
     */
    public void push(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty()) {
            return EMPTY_RETURN_VALUE;
        }
        return last.getValue();
    }

    public int pop() {
        if (isEmpty()) {
            return EMPTY_RETURN_VALUE;
        }

        int ret = last.getValue();
        last = last.getPrev();

        if (last != null) {
            last.setNext(null);
        }

        return ret;
    }

    private class Node {
        private final int value;
        private Node prev;
        private Node next;

        public Node(int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}