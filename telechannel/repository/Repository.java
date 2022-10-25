package ru.vsuet.telechannel.repository;

import java.util.List;

public interface Repository<T> {

    T find(String name);
    void add(T source);
    void remove(T target);
    List<T> list();
}
