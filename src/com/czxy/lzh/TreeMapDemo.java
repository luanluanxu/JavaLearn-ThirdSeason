package com.czxy.lzh;

import java.util.TreeMap;

public class TreeMapDemo {
    // 使用tree树型存储
    public static void main(String[] args) {
        TreeMap<String,String> treeMap = new TreeMap();
        treeMap.put("name","乱序");
        treeMap.put("age","18");

        System.out.println("name: "+treeMap.get("name"));
    }
}
