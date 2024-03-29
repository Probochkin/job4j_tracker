package ru.job4j.tracker;

import java.util.List;

public class ShowAll implements UserAction {
    private final Output out;

    public ShowAll(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Store store) {
        out.println("=== Show all items ===");
        List<Item> items = store.findAll();
        if (!items.isEmpty()) {
            for (Item item : items) {
                out.println(item.toString());
            }
        } else {
            out.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}
