package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY_LIST_INDICATOR = -1;
	Node last;
    int i;
  
    private static final int EMPTY_RETURN_VALUE = -1;

    private Node last;


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

        if (isEmpty())
            return EMPTY_LIST_INDICATOR;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_LIST_INDICATOR;
        int ret = last.value;
        last = last.prev;

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
}