package ru.sbrf.lessons.lesson_6.animal;

import ru.sbrf.lessons.lesson_6.opportunities.Eat;
import ru.sbrf.lessons.lesson_6.opportunities.MakeSounds;
import ru.sbrf.lessons.lesson_6.opportunities.Moving;

public class Animal implements Eat, MakeSounds, Moving {
    @Override
    public void eat() {
        System.out.println("Животные могут принимать пищу");
    }

    @Override
    public void makeSounds() {
        System.out.println("Животные могут издавать звуки");
    }

    @Override
    public void moving() {
        System.out.println("Животные могут двигаться");
    }
}
