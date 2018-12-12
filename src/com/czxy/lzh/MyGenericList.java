package com.czxy.lzh;

public class MyGenericList<T> {
    private T[] dataArray = (T[])new Object[100];

    private int index = 0;

    public void add(T data) {
        dataArray[index] = data;
        index++;
    }

    public T get(int index) {
        if(index>=0 && index<=this.index-1) {
            return dataArray[index];
        }else {
            return null;
        }
    }

    public int size() {
        return index;
    }

}
