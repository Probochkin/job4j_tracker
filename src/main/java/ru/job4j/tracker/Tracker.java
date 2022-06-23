package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return items;
    }

    public Item findById(int id) {
        Item item = indexFound(id);
        return item != null ? item : null;
    }

    public List<Item> findByName(String key) {
//        Item[] rsl = new Item[100];
//        int size = 0;
//        for (int index = 0; index < this.size; index++) {
//            if (items[index].getName().equals(key)) {
//
//                rsl[size] = items[index];
//                size++;
//            }
//        }
//        return Arrays.copyOf(rsl, size);
        List<Item> rsl = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    private Item indexFound(int id) {
        Item rsl = null;
//        for (int index = 0; index < size; index++) {
//            if (items[index].getId() == id) {
//                rsl = index;
//                break;
//            }
//        }
        for (Item item : items) {
            if (item.getId() == id) {
                rsl = item;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
//        int index = indexOf(id);
//        boolean result = index != -1;
//        if (result) {
//            item.setId(id);
//            items[index] = item;
//        }
//        return result;
        Item found = indexFound(id);
        boolean result = found != null;
        if (result) {

            found.setName(item.getName());

        }
        return result;
    }

    public boolean delete(int id) {
//        int index = indexOf(id);
//        boolean rsl = index != -1;
//        if (rsl) {
//            System.arraycopy(items, index + 1, items, index, size - index - 1);
//            items[size - 1] = null;
//            size--;
//        }
//        return rsl;
        Item found = indexFound(id);
        boolean rsl = found != null;
        if (rsl) {

            items.remove(found);

        }
       return rsl;
    }
}