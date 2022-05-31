package ru.job4j.opp;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже\n"
                    +
                    "Пешеходы по лужам,\n"
                    +
                    "А вода по асфальту рекой.\n"
                    +
                    "И не ясно прохожим...");
        }
        if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят,\n"
                    +
                    "Одеяла и подушки ждут ребят.\n"
                    +
                    "Даже сказка спать ложится,\n"
                    +
                    "Чтобы ночью нам присниться.\n"
                    +
                    "Ты ей пожелай: «Баю-бай!»");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
 Jukebox jukeBox = new Jukebox();
 jukeBox.music(1);
 jukeBox.music(2);
 jukeBox.music(3);
    }
}
