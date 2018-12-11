package com.czxy.lzh;

import java.util.LinkedList;

// 频繁的进行数据的插入，删除，优先使用LinkedList (性能更高)
public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("乱序");
        linkedList.addFirst("小乱序");

        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("小红");
        linkedList.addAll(linkedList1);

        for (Object obj: linkedList) {
            System.out.println(obj);
        }

    }

}
