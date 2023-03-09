package _2023_03_02;

public interface MyQueue<T> {
    void add(T el);
    void remove();
    boolean isEmpty();
    T get();
}
