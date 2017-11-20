package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {
    @Test
    public void shouldUpdateMentor() {
        //Given
        Student andrewGolota = new Student("Andrew Golota");
        Student popek = new Student("Popek");
        Mentor louDouva = new Mentor("Lou Douva");
        Homework techniqueHomework = new Homework("Clinched fist");
        techniqueHomework.registerObserver(louDouva);

        //When
        techniqueHomework.addHomeworkOwner(andrewGolota);
        techniqueHomework.addHomeworkOwner(popek);

        //Then
        Assert.assertEquals((Integer) 2, louDouva.getHomeworksAddedCount());
    }
}
