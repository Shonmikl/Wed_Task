package _2023_03_02;

import java.util.ArrayList;

public class MyQueueImpl<T> implements MyQueue<T>{
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void add(Object el) {
        //at the end of this list
    }

    @Override
    public T remove() {
        //first and return
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T get() {
        //only first
    }
}
