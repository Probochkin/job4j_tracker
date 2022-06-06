package ru.job4j.pojo;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        Student student = new Student();
        student.setFullName("Иванов Петр Иванович");
        student.setDateEntry(new Date());
        student.setGroup("13ВЭ2");
        System.out.println("Студент" + student.getFullName() + " группы " + student.getGroup() + " поступил " + student.getDateEntry());
    }
}
