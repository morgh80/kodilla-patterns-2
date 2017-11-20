package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private String name;
    private Integer homeworksAddedCount = 0;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Homework homework) {
        System.out.println(homework.getHomeworkOwners().get(0).getStudentName() + " added homework: " + homework.getHomeworkName());
        homeworksAddedCount++;
        if (homeworksAddedCount == 1) {
            System.out.println("You have " + homeworksAddedCount + " homework to review");
        } else {
            System.out.println("You have " + homeworksAddedCount + " homeworks to review");
        }
    }

    public String getName() {
        return name;
    }

    public Integer getHomeworksAddedCount() {
        return homeworksAddedCount;
    }
}
