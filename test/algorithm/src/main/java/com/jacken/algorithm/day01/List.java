package com.jacken.algorithm.day01;

public interface List<E> {

    void clear();
    int size();
    boolean isEmpty();
    boolean contains(E  element);
    void add(E  element);
    E   get(int index);
    E  set(int index,E element);
    void  add(int index,E element);
    E  remove(int index);
    int indexOf(E  element);

}