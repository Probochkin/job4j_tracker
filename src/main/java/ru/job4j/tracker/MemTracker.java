package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class MemTracker implements Store {
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

        for (Item item : items) {
            if (item.getId() == id) {
                rsl = item;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {

        Item found = indexFound(id);
        boolean result = found != null;
        if (result) {

            found.setName(item.getName());

        }
        return result;
    }

    public boolean delete(int id) {

        Item found = indexFound(id);
        boolean rsl = found != null;
        if (rsl) {

            items.remove(found);

        }
       return rsl;
    }
}