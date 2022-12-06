package com.company;

import java.util.ArrayList;

public class LearningVector {

    private int array[];
    private static int size = 0;
    private static int capacity = 10;


    public LearningVector(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = size;
    }

    public LearningVector() {
        this.array = new int[capacity];
        this.size = size;
        this.capacity = capacity;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public boolean isEmtpy(){
        return size == 0;
    }

    public int at(int at) throws Exception {
        if (at > size - 1 || at < 0) {
            throw new Exception("Index out of bounds");
        } else
            return array[at];
    }

    public void push(int num){
        if (size == capacity){
            resize(capacity * 2);
        }
        array[size++] = num;
    }

    public void insert(int index, int num){
        if (size == capacity){
            resize(capacity * 2);
        }

        for (int i = size - 1; i >= index; i--) {
            array[i+1] = array[i];
        }
        array[index] = num;
        size++;
    }

    public void prepend(int num){
        insert(0, num);
    }

    public int pop(){
        int value = array[size - 1];
        array[size] = 0;
        size--;

        if ((size * 4) < capacity)
            resize(capacity/2);

        return value;
    }

    public void delete(int index) throws Exception {
        if (index > size - 1 || index < 0) {
            throw new Exception("Index out of bounds");
        }
        else {
            for (int i = index; i < size - 1; i++)
                array[i] = array[i + 1];
            size--;

            if ((size * 4) < capacity)
                resize(capacity / 2);
        }
    }

    public void remove(int num) throws Exception {
        for (int i = 0; i < size; i++) {
            if (array[i] == num){
                delete(i);
                i--;
            }
        }
    }

    public int find(int num){
        for (int i = 0; i < size; i++) {
            if(array[i] == num)
                return i;
        }
        return -1;
    }

    private void resize(int newCapacity){
        capacity = newCapacity;
        int[] resizedArray = new int[newCapacity];

        for (int i = 0; i < size; i++) {
            resizedArray[i] = array[i];
        }
        array = resizedArray;
    }



}
