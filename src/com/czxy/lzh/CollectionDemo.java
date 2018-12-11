package com.czxy.lzh;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        Person person = new Person();
        Person person2 = new Person();
        personArrayList.add(person);
        personArrayList.add(person2);

        for (Person p : personArrayList) {
            p.eat();
        }

    }
}
