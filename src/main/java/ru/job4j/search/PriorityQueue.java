package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    /**
     * Хранение задания осуществляется в коллекции типа LinkedList
     */
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (tasks.isEmpty()) {
                break;
            } else if (element.getPriority() < task.getPriority()) {
                index++;
            }
        }
        this.tasks.add(index, task);
    }

    /**
     * Метод позволяет получить первую задачу в очереди
     * @return возвращает задачу из головы очереди или null если очередь пуста
     */
    public Task take() {
        return tasks.poll();
    }
}
