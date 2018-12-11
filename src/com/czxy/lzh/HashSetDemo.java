package com.czxy.lzh;

import java.util.HashSet;

public class HashSetDemo {
    // ArrayList LinkedList Vector 可添加重复数据，有序
    // HashSet　自动去重，无序
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("小小");
        hashSet.add("大大");
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("乱序2");
        HashSet<String> hashSet2 = (HashSet)hashSet.clone();
        System.out.println(hashSet.equals(hashSet2));

        hashSet.addAll(hashSet1);

        for (String name : hashSet) {
            System.out.println(name);
        }
    }
}
