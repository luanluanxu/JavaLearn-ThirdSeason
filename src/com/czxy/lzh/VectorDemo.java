package com.czxy.lzh;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // 与ArrayList的区别是　Vector是同步的，线程安全
        Vector<String> vector = new Vector<>();
        vector.add("小兰");
        vector.add("小白");
        Vector<String> vector1 = new Vector<>();
        vector1.add("小红");
        vector1.add("小星");
        vector.addAll(vector1);

        for (Object obj : vector) {
            System.out.println(obj);
        }
    }
}
