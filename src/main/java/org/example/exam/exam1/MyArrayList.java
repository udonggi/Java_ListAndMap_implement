package org.example.exam.exam1;

public class MyArrayList<T> {
    private String[] data = new String[2];
    private int size = 0;
    public int size() {
        return size;
    }

    public boolean add(String element) {
        size++;
        data[size] = element;
        return true;
    }

    public String get(int index) {
        return data[index];
    }
}