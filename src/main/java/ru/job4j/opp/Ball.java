package ru.job4j.opp;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Колобок съеден");
        } else {
            System.out.println("Колобок убежал");
        }
    }

    public static void main(String[] args) {
        Ball ball = new Ball();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        Hare hare = new Hare();
        wolf.tryEat(ball);
        hare.tryEat(ball);
        fox.tryEat(ball);
    }
}
