package com.company;

import java.util.Arrays;

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
        Element newElement = new Element(value);
        if (count == 0) {
            first = newElement;
        } else {
            Element last = getElementAtIndex(count - 1);
            last.next = newElement;
        }
        count++;
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
        return getElementAtIndex(index).value;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void set(int index, int value) {
        getElementAtIndex(index).value = value;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = get(i);
        }
        return Arrays.toString(arr);
    }

    private Element getElementAtIndex(int index) {
        Element tmp = first;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

}
