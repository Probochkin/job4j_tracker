package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ItemAscByNameTest {

    @Test
    public void compareItemAscByNameTest() {
        Item first = new Item("First");
        Item second = new Item("Second");
        Item third = new Item("Third");
        List<Item> items = new ArrayList<>();
        items.add(second);
        items.add(third);
        items.add(first);
        List<Item> expected = new ArrayList<>();
        expected.add(first);
        expected.add(second);
        expected.add(third);
        items.sort(new ItemAscByName());
        assertEquals(items, expected);
    }
    }
