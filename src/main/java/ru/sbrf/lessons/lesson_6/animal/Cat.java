package ru.sbrf.lessons.lesson_6.animal;

import ru.sbrf.lessons.lesson_6.opportunities.ClimbUpTrees;
import ru.sbrf.lessons.lesson_6.opportunities.Eat;
import ru.sbrf.lessons.lesson_6.opportunities.MakeSounds;
import ru.sbrf.lessons.lesson_6.opportunities.Moving;

public class Cat implements ClimbUpTrees, Eat, MakeSounds, Moving {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void climbUpTrees() {
        System.out.println("Кошка умеет лазать по деревьям");
    }

    @Override
    public void eat() {
        System.out.println("Кошка кушает: 'чавк-чавк'");
    }

    @Override
    public void makeSounds() {
        System.out.println("Кошка издает звук: 'Meow'");
    }

    @Override
    public void moving() {
        System.out.println("Кошка может бегать и прыгать");
    }
}
