package ru.sbrf.lessons.lesson_6.animal;

import ru.sbrf.lessons.lesson_6.opportunities.Eat;
import ru.sbrf.lessons.lesson_6.opportunities.MakeSounds;
import ru.sbrf.lessons.lesson_6.opportunities.Moving;
import ru.sbrf.lessons.lesson_6.opportunities.Swim;

public class Dog implements Swim, Eat, MakeSounds, Moving {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Собака умеет плавать");
    }

    @Override
    public void eat() {
        System.out.println("Собака кушает: 'чавк-чавк'");
    }

    @Override
    public void makeSounds() {
        System.out.println("Собака издает звук: 'Woof-Woof'");
    }

    @Override
    public void moving() {
        System.out.println("Собака может бегать и прыгать");
    }
}
