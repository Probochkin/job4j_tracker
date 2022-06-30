package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void compareItemAscByName() {
        Item first = new Item("First");
        Item second = new Item("Second");
        Item third = new Item("Third");
        List<Item> items = new ArrayList<>();
        items.add(second);
        items.add(third);
        items.add(first);
        List<Item> expected = new ArrayList<>();
        expected.add(third);
        expected.add(second);
        expected.add(first);
        items.sort(new ItemDescByName());
        assertEquals(items, expected);
    }
}