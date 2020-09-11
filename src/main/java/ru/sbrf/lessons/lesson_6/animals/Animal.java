package ru.sbrf.lessons.lesson_6.animals;

import ru.sbrf.lessons.lesson_6.opportunities.Eat;
import ru.sbrf.lessons.lesson_6.opportunities.MakeSounds;
import ru.sbrf.lessons.lesson_6.opportunities.Move;

public class Animal implements Eat, MakeSounds, Move {

    public void Eat() {
        System.out.println("Animal can eating");
    }

    public void MakeSounds() {
        System.out.println("Animal can sounds");
    }

    public void Move() {
        System.out.println("Animal can moving");
    }
}
