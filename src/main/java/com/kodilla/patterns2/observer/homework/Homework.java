package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.homework.Observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Homework implements Observable {
    private final String homeworkName;
    private final LinkedList<Student> homeworkOwners;
    private final List<Observer> observers;

    public Homework(String homeworkName) {
        observers = new ArrayList<>();
        this.homeworkName = homeworkName;
        homeworkOwners = new LinkedList<>();
    }

    public void addHomeworkOwner(Student student) {
        homeworkOwners.addFirst(student);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getHomeworkName() {
        return homeworkName;
    }

    public List<Student> getHomeworkOwners() {
        return homeworkOwners;
    }

}
