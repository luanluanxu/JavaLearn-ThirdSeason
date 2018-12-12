package com.czxy.lzh;

public class MyArrayList {
    public static void main(String[] args) {
        MyGenericList<String> myGenericList = new MyGenericList<>();
        myGenericList.add("乱序");
        myGenericList.add("小小");

        for (int i =0;i<myGenericList.size();i++){
            System.out.println(myGenericList.get(i));
        }
    }
}
