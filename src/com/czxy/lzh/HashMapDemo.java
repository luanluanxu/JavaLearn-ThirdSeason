package com.czxy.lzh;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // 使用hash值储存
        //　保存的是键值对.重复对一个键put会覆盖,键不存在返回值null
        HashMap hashMap = new HashMap();
        hashMap.put("name","乱序");
        hashMap.put("age",18);

        System.out.println("name: " +hashMap.get("name"));

        for (Object key : hashMap.keySet()) {
            System.out.println("key:" + key.toString() + "----" + "value:" + hashMap.get(key));
        }
    }
}
