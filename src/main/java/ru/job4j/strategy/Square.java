package ru.job4j.strategy;

public class Square implements Shape {
    public String draw() {
        String ln = System.lineSeparator();
        return    "  " + ln
                + "|¯¯¯|" + ln
                + "|___|" + ln;
    }
}
