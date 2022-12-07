package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Pupkin Ivan Ivanovich");
        student.setGrup("1G4");
        student.setEntry(new Date());

        System.out.println(student.getEntry() + " " + student.getFullName() + " " + student.getGrup());
    }
}
