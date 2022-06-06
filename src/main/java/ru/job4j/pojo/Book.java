package ru.job4j.pojo;

public class Book {
    private String name;
    private int pageCounts;

public Book(String name, int pageCounts) {
    this.name = name;
    this.pageCounts = pageCounts;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCounts() {
        return pageCounts;
    }

    public void setPageCounts(int pageCounts) {
        this.pageCounts = pageCounts;
    }
}
