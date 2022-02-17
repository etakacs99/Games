package com;

public class MyArray {
    private int[] array;
    private int nextIndex;

    public MyArray(int n) {
        array = new int[n];
        nextIndex = 0;
    }

    public int getSize() {
        return nextIndex;
    }

    public boolean isEmpty() {
        if (nextIndex == 0) {
            return true;
        }
        return false;
    }

    public int get(int idx) throws ArrayIndexOutOfBoundsException {
        if (idx < 0 || idx > nextIndex - 1) {
            throw new ArrayIndexOutOfBoundsException("The array index is out of bounds.");
        }
        return array[idx];
    }

    public void add(int elem) throws IllegalStateException {
        if (array.length == nextIndex) {
            throw new IllegalStateException("The array is full.");
        }
        array[nextIndex] = elem;
        nextIndex++;
    }

    public void remove() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("The array is empty, you can't use the remove() method.");
        }
        nextIndex--;
    }

}