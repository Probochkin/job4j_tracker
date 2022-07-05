package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
       String[] o1mass =  o1.split("/");
        String[] o2mass =  o2.split("/");
        if (o1mass[0].compareTo(o2mass[0]) == 0) {
            return o1.compareTo(o2);
        } else {
            return o2.compareTo(o1);
        }
    }
}