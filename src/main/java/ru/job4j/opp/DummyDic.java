package ru.job4j.opp;

public class DummyDic {
    public String engToRus(String eng) {
    return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        System.out.println(dummyDic.engToRus("three"));
    }
}
