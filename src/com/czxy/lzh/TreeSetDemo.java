package com.czxy.lzh;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("乱序");
        treeSet.add("小燕");
        treeSet.add("siki");

        for (String name : treeSet) {
            System.out.println(name);
        }
    }
}
