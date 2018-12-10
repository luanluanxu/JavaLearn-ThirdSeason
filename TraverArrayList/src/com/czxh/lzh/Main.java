package com.czxh.lzh;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("小红");
        arrayList.add("小白");
        ArrayList<String> arrayList1 = new ArrayList();
        arrayList1.add("小兰");
        arrayList1.add("小星");
        // 合并集合
        arrayList.addAll(arrayList1);

        // foreach　推荐使用
        for (Object obj : arrayList) {
            System.out.println(obj);
        }
        //　ArrayList遍历器 不推荐使用
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
