package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        int size = 0;
        for (int index = 0; index < this.size; index++) {
           if (items[index] != null) {
               size++;
           }
       }
       return Arrays.copyOf(items, size);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[100];
        int size = 0;
        for (int index = 0; index < this.size; index++) {
            if (items[index].getName().equals(key)) {

                rsl[size] = items[index];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            items[index].setName(item.getName());
            items[index].setId(id);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        System.arraycopy(this.items, index + 1, this.items, index, size - index - 1);
        items[size - 1] = null;
        size--;
        return true;
    }
}