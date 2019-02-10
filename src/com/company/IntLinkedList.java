package com.company;

public class IntLinkedList implements IntList {

    private class Element {
        int value;
        Element next;

        Element(int value) {
            this.value = value;
        }
    }

    private int count = 0;
    private Element first;

    @Override
    public void add(int value) {
    }

    @Override
    public void clear() {
        first = null;
        count = 0;
    }

    @Override
    public boolean contains(int value) {
        return false;
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void set(int index, int value) {

    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        return "IntLinkedList{}";
    }

    private Element getElementAtIndex(int index) {
        Element tmp = first;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

}
